using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace formulario.logica
{
    public class Producto : INotifyPropertyChanged, ICloneable, IDataErrorInfo
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
        private String tipo;
        public String Tipo
        {
            get
            {
                return tipo;
            }
            set
            {
                this.tipo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Tipo"));
            }
        }
        private double precio;
        public double Precio
        {
            get
            {
                return precio;
            }
            set
            {
                this.precio = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Precio"));
            }
        }
        private int cantidad;
        public int Cantidad
        {
            get
            {
                return cantidad;
            }
            set
            {
                this.cantidad = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Cantidad"));
            }
        }  

        public Producto(String nombre, String tipo, double precio, int cantidad)
        {
            this.cantidad = cantidad;
            this.nombre = nombre;
            this.tipo = tipo;
            this.precio = precio;
        }
        public Producto()
        {
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public string Error
        {
            get { return "nada"; }
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
                        result = "Debe introducir el nombre del producto";
                    }
                }
                if (columnName == "Tipo")
                {
                    if (string.IsNullOrEmpty(tipo))
                    {
                        result = "Debe introducir un tipo de material";
                    }
                }
                if (columnName == "Precio")
                {
                    if (precio==0)
                    {
                        result = "Debe introducir un precio";
                    }
                }
                if (columnName == "Cantidad")
                {
                    if (precio == 0)
                    {
                        result = "Debe introducir una cantidad";
                    }
                }
                return result;
            }
        }
    }
}
