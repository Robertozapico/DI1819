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
    /// Lógica de interacción para Main.xaml
    /// </summary>
    public partial class Main : Window
    {
        public LogicaNegocio logicaMetodos = new LogicaNegocio();
        public Main()
        {
            InitializeComponent();
        }


        private void btAlta_Click(object sender, RoutedEventArgs e)
        {
            PantallaAltaAvituallamiento pantallaAvituallamiento = new PantallaAltaAvituallamiento(logicaMetodos);
            pantallaAvituallamiento.ShowDialog();  
        }

        private void btProductos_Click(object sender, RoutedEventArgs e)
        {
            //PantallaProducto pantallaProductos = new PantallaProducto(logicaMetodos);
            gestionProductos pantallaProductos = new gestionProductos(logicaMetodos);
            pantallaProductos.ShowDialog();

        }

        private void btCarreras_Click(object sender, RoutedEventArgs e)
        {
            PantallaCarreras pantallaCarreras = new PantallaCarreras(logicaMetodos);
            pantallaCarreras.ShowDialog();
        }



    }
}

//FALTAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//VER AVITUALLAMIENTOS
//CREAR AVITUALLAMIENTOS