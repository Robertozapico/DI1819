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
    /// Interaction logic for PantallaAvituallamientosCarrera.xaml
    /// </summary>
    public partial class PantallaAvituallamientosCarrera : Window
    {
        public LogicaNegocio logicaMetodos { get; set; }
        public Carrera carreraEscogida { get; set; }
        public int indexAvituallamientos=-1;

        public PantallaAvituallamientosCarrera()
        {
            InitializeComponent();
        }
        public PantallaAvituallamientosCarrera(int numeroCarrera, LogicaNegocio logicaMetodos)
        {
            InitializeComponent();
            this.logicaMetodos = logicaMetodos;
            this.carreraEscogida = logicaMetodos.Carreras[numeroCarrera];
            this.DataContext = this;
            
        }

        private void btCerrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void tablaAvituallamientos_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            indexAvituallamientos = tablaAvituallamientos.SelectedIndex;
        }

        private void btModificar_Click(object sender, RoutedEventArgs e)
        {
            if (indexAvituallamientos == -1)
            {
                MessageBox.Show("Selecciona un avituallamiento");
            }
            else
            {
                PantallaAltaAvituallamiento pantallaAvituallamiento = new PantallaAltaAvituallamiento(this.logicaMetodos, this.carreraEscogida.AvituallamientoDeCarrera[indexAvituallamientos], this.carreraEscogida);
                pantallaAvituallamiento.ShowDialog();
                indexAvituallamientos = -1;
            }
        }

        private void btEliminar_Click(object sender, RoutedEventArgs e)
        {
            if (indexAvituallamientos == -1)
            {
                MessageBox.Show("Selecciona un avituallamiento");
            }
            else {
                logicaMetodos.borrarAvituallamientoCarrera(carreraEscogida, indexAvituallamientos);
                indexAvituallamientos = -1;
            }
        }
    }
}
