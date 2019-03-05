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
    /// Interaction logic for PantallaCrearCarrera.xaml
    /// </summary>
    public partial class PantallaCrearCarrera : Window
    {
        public Carrera carreraNueva { get; set; }
        public LogicaNegocio logicaMetodos { get; set; }
        private int errores;

        public PantallaCrearCarrera(LogicaNegocio logicaMetodos)
        {
            InitializeComponent();
            this.logicaMetodos = logicaMetodos;
            this.carreraNueva = new Carrera();
            this.DataContext = this;
        }

        private void btCerrar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btCrear_Click(object sender, RoutedEventArgs e)
        {
            logicaMetodos.crearCarrera(carreraNueva);
            this.Close();
        }
        //PARA QUE REFRESQUE LA CANTIDAD DE ERRORES COMO NO TENGO MAS CAMPOS TENGO QUE USAR EL TABULADOR PARA QUE SELECCIONE UN BOTON
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
                btCrear.IsEnabled = true;
            }
            else
            {
                btCrear.IsEnabled = false;
            }
        }
    }
}