using formulario.logica;
using System;
using System.Collections.Generic;
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
    /// Lógica de interacción para gestionProductos.xaml
    /// </summary>
    public partial class gestionProductos : Window
    {
        public LogicaNegocio logicaMetodos { get; set; }
        private int productoEscogido = -1;
        public gestionProductos(LogicaNegocio logicaMetodos)
        {
            InitializeComponent();
            this.logicaMetodos = logicaMetodos;
            this.DataContext = this;
        }

        private void btAnnadir_Click(object sender, RoutedEventArgs e)
        {
            PantallaProducto pantallaProductos = new PantallaProducto(logicaMetodos);
            pantallaProductos.ShowDialog();
            
        }

        private void btCerrrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void tablaProductos_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            productoEscogido = tablaProductos.SelectedIndex;
        }

        private void btEliminar_Click(object sender, RoutedEventArgs e)
        {
            logicaMetodos.borrarProductoLista(productoEscogido);
        }

        private void tablaProductos_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            PantallaProducto pantallaProductos = new PantallaProducto(logicaMetodos, productoEscogido);
            pantallaProductos.ShowDialog();
        }
    }
}
