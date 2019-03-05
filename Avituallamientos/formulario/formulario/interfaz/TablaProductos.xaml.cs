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

namespace formulario.interfaz
{
    /// <summary>
    /// Lógica de interacción para TablaProductos.xaml
    /// </summary>
    public partial class TablaProductos : Window
    {
        public LogicaNegocio logicaMetodos { get; set; }
        public ObservableCollection<Producto> ProductosAvituallamientoActual { get; set; }

        public TablaProductos(LogicaNegocio logicaMetodos, ObservableCollection<Producto> ProductosAvituallamientoActual)
        {
            InitializeComponent();
            this.logicaMetodos = logicaMetodos;
            this.ProductosAvituallamientoActual = ProductosAvituallamientoActual;
            this.DataContext = this;

        }

        private void btCerrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btAnnadir_Click(object sender, RoutedEventArgs e)
        {
            logicaMetodos.annadirProductosAvituallamiento(logicaMetodos.Productos[tablaProductosExistentes.SelectedIndex], ProductosAvituallamientoActual);
            this.Close();
        }
    }
}
