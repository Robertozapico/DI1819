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
    /// Interaction logic for PantallaCarreras.xaml
    /// </summary>
    public partial class PantallaCarreras : Window
    {
        public LogicaNegocio logicaMetodos { get; set; }
        private int carreraEscogida = -1;


        public PantallaCarreras(LogicaNegocio logicaMetodos)
        {
            InitializeComponent();
            this.logicaMetodos = logicaMetodos;
            this.DataContext = this;
        }

        private void btCerrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btCrear_Click(object sender, RoutedEventArgs e)
        {
            PantallaCrearCarrera pantallaCrearCarrera = new PantallaCrearCarrera(this.logicaMetodos);
            pantallaCrearCarrera.ShowDialog();
        }

        private void btGestionarAvituallamientos_Click(object sender, RoutedEventArgs e)
        {
            if (carreraEscogida == -1)
            {
                MessageBox.Show("Escoge una Carrera");
            }
            else
            {
                PantallaAvituallamientosCarrera pantallaAvituallamientosCarrera = new PantallaAvituallamientosCarrera(carreraEscogida, this.logicaMetodos);
                pantallaAvituallamientosCarrera.ShowDialog();
            }
        }

        private void tablaCarreras_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            carreraEscogida = tablaCarreras.SelectedIndex;
        }

        private void btEliminar_Click(object sender, RoutedEventArgs e)
        {
            if (carreraEscogida == -1)
            {
                MessageBox.Show("Escoge una Carrera");
            }
            else
            {
                logicaMetodos.eliminarCarrera(carreraEscogida);
            }
        }
    }
}
