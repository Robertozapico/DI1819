using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace formulario.logica
{
    public class Carrera : INotifyPropertyChanged, IDataErrorInfo
    {
        public ObservableCollection<Avituallamiento> AvituallamientoDeCarrera { get; set; }
        private String nombreCarrera;
        public String NombreCarrera
        {
            get
            {
                return nombreCarrera;
            }
            set
            {
                this.nombreCarrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NombreCarrera"));
            }
        }

        public Carrera(String nombre)
        {
            this.nombreCarrera = nombre;
            this.AvituallamientoDeCarrera = new ObservableCollection<Avituallamiento>();
        }
        public Carrera()
        {
            this.AvituallamientoDeCarrera = new ObservableCollection<Avituallamiento>();
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
                if (columnName == "NombreCarrera")
                {
                    if (string.IsNullOrEmpty(nombreCarrera))
                    {
                        result = "Debe introducir el nombre de la carrera";
                    }
                }
                return result;
            }
        }
    }
}
