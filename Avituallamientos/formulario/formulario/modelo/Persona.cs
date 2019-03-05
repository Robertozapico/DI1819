using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace formulario.logica
{
    public class Persona : INotifyPropertyChanged, IDataErrorInfo
    {
        private String nombre;
        public String Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }
        private int telefono;
        public int Telefono
        {
            get
            {
                return telefono;
            }
            set
            {
                this.telefono = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Telefono"));
            }
        }


        public Persona(String nombre, int telefono)
        {
            this.nombre = nombre;
            this.telefono = telefono;
        }
        public Persona()
        {
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
                if (columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(nombre))
                    {
                        result = "Debe introducir el nombre de la persona";
                    }
                }
                if (columnName == "Telefono")
                {
                    if (telefono == 0)
                    {
                        result = "Debe introducir el número de la persona";
                    }
                }
                return result;
            }
        }
    }
}
