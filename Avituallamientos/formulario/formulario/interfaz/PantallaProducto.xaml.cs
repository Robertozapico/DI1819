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
using System.Windows.Shapes;

namespace formulario
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class PantallaProducto : Window
    {
        public LogicaNegocio logicaMetodos { get; set; }
        public Producto productoNuevo { get; set; }
        public List<String> tiposProductos { get; set; }
        private int errores;
        
        public PantallaProducto()
        {
            InitializeComponent();
            tiposProductos = new List<string>() {"Comida", "Bebida", "Material sanitario"};
            this.productoNuevo = new Producto();
            this.DataContext = this;
        }
        public PantallaProducto(LogicaNegocio logicaMetodos)
        {
            InitializeComponent();
            tiposProductos = new List<string>() { "Comida", "Bebida", "Material sanitario" };
            this.productoNuevo = new Producto();
            this.DataContext = this;
            this.logicaMetodos = logicaMetodos;
        }

        public PantallaProducto(LogicaNegocio logicaMetodos, int index)
        {
            InitializeComponent();
            tiposProductos = new List<string>() { "Comida", "Bebida", "Material sanitario" };
            this.logicaMetodos = logicaMetodos;
            this.productoNuevo = logicaMetodos.Productos[index];
            this.DataContext = this;
        }
        private void btCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btAnnadir_Click(object sender, RoutedEventArgs e)
        {
            logicaMetodos.annadirProductoLista(productoNuevo);   
            this.Close();
        }

        private void ComboBox_SelectionChanged_1(object sender, SelectionChangedEventArgs e)
        {

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
                btAnnadir.IsEnabled = true;
            }
            else
            {
                btAnnadir.IsEnabled = false;
            }
        }

    }
}
