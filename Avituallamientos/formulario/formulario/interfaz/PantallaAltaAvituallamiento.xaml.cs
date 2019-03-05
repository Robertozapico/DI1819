using formulario.interfaz;
using formulario.logica;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace formulario
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    /// 
    public partial class PantallaAltaAvituallamiento : Window
    {
        public Avituallamiento avituallamiento { get; set; }
        public Persona persona { get; set; }
        public LogicaNegocio logicaMetodos { get; set; }
        public ObservableCollection<Producto> ProductosAvituallamientoActual { get; set; }
        private int productoEscogido = -1;
        private Boolean nueva = true;
        private Carrera carreraNueva;
        private int errores;


        public PantallaAltaAvituallamiento(LogicaNegocio logicaMetodos)
        {
            this.logicaMetodos = logicaMetodos;
            this.avituallamiento = new Avituallamiento();
            this.persona = new Persona();
            this.ProductosAvituallamientoActual = new ObservableCollection<Producto>();
            InitializeComponent();
            this.DataContext = this;
        }

        public PantallaAltaAvituallamiento(LogicaNegocio logicaMetodos, Avituallamiento avituallamiento, Carrera carrera)
        {
            this.logicaMetodos = logicaMetodos;
            this.avituallamiento = avituallamiento;
            this.persona = avituallamiento.PersonaContacto;
            this.ProductosAvituallamientoActual = avituallamiento.Productos;
            nueva = false;
            this.carreraNueva = carrera;
            InitializeComponent();
            this.DataContext = this;
        }

        private void btAnnadir_Click(object sender, RoutedEventArgs e)
        {
            TablaProductos pantallaProducto = new TablaProductos(this.logicaMetodos, this.ProductosAvituallamientoActual);
            pantallaProducto.ShowDialog();
        }

        private void btCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void BtAlta_Click(object sender, RoutedEventArgs e)
        {
            logicaMetodos.annadirPersonaContacto(this.persona, this.avituallamiento);
            if (nueva)
            {
                carreraNueva = new Carrera(avituallamiento.CarreraAvituallamiento);
                logicaMetodos.crearCarrera(carreraNueva);
                logicaMetodos.annadirListaProductosAvituallamiento(avituallamiento, ProductosAvituallamientoActual);
                logicaMetodos.annadirAvituallamientoCarrera(this.avituallamiento, avituallamiento.CarreraAvituallamiento);
            }
            else
            {
                carreraNueva.AvituallamientoDeCarrera.Remove(avituallamiento);
                if (!carreraNueva.NombreCarrera.Equals(avituallamiento.CarreraAvituallamiento))
                {
                    carreraNueva = new Carrera(avituallamiento.CarreraAvituallamiento);
                }
                logicaMetodos.crearCarrera(carreraNueva);
                logicaMetodos.annadirListaProductosAvituallamiento(avituallamiento,ProductosAvituallamientoActual);
                logicaMetodos.annadirAvituallamientoCarrera(this.avituallamiento, avituallamiento.CarreraAvituallamiento);
            }
            this.Close();
        }

        private void btEliminarProducto_Click(object sender, RoutedEventArgs e)
        {
            if (productoEscogido == -1)
            {
                MessageBox.Show("Escoge el producto que quieres eliminar.");
            }
            else
            {
                logicaMetodos.borrarProductoAvituallamiento(productoEscogido, this.ProductosAvituallamientoActual);
                MessageBox.Show("Producto eliminado de la lista");
                productoEscogido = -1;
            }

        }

        private void tablaProductos_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            productoEscogido = tablaProductos.SelectedIndex;
        }
        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                errores++;
            }
            else
            {
                errores--;
            }
            if (errores == 0)
            {
                BtAlta.IsEnabled = true;
            }
            else
            {
                BtAlta.IsEnabled = false;
            }
        }
    }
}
