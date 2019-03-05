using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;
using System.Collections.ObjectModel;
using System.ComponentModel;

namespace formulario.logica
{
    public class Avituallamiento : INotifyPropertyChanged, IDataErrorInfo
    {
        public ObservableCollection<Producto> Productos { get; set; }
        private String carreraAvituallamiento;
        public String CarreraAvituallamiento
        {
            get
            {
                return carreraAvituallamiento;
            }
            set
            {
                this.carreraAvituallamiento = value;
                //esto es lo que se ancla al binding
                this.PropertyChanged(this, new PropertyChangedEventArgs("CarreraAvituallamiento"));
            }
        }
        private double puntoKilometrico;
        public double PuntoKilometrico
        {
            get
            {
                return puntoKilometrico;
            }
            set
            {
                this.puntoKilometrico = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PuntoKilometrico"));
            }
        }
        private Persona personaContacto;
        public Persona PersonaContacto
        {
            get
            {
                return personaContacto;
            }
            set
            {
                this.personaContacto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PersonaContacto"));
            }
        }

        public Avituallamiento(Persona persona, double puntoKilometrico, String carrera)
        {
            this.personaContacto = persona;
            this.puntoKilometrico = puntoKilometrico;
            this.carreraAvituallamiento = carrera;
            Productos = new ObservableCollection<Producto>();
        }
        public Avituallamiento()
        {
            this.personaContacto = new Persona();
            this.Productos = new ObservableCollection<Producto>();
        }


        public event PropertyChangedEventHandler PropertyChanged;


        public string Error
        {
            get { return ""; }
        }

        public string this[string columnName]
        {
            get 
            {
                string result = "";
                if(columnName == "CarreraAvituallamiento"){
                    if (string.IsNullOrEmpty(carreraAvituallamiento))
                    {
                        result = "Debe introducir el nombre de la carrera";
                    }
                }
                if(columnName == "PuntoKilometrico"){
                    if (puntoKilometrico == 0)
                    {
                        result = "Debe introducir el punto kilométrico";
                    }
                }
                if(columnName == "PersonaContacto"){
                    if(personaContacto==null)
                    {
                        result = "Debe introducir los datos de la persona de contacto";
                    }
                }
                if (columnName == "Productos")
                {
                    if(Productos.Count==0)
                    {
                        result = "Debe añadir algún material";
                    }
                }
                return result;
            }
        }
    }
}
