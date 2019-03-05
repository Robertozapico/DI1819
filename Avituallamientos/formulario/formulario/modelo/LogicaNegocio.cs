using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace formulario.logica
{
    public class LogicaNegocio
    {
        public ObservableCollection<Carrera> Carreras { get; set; }
        public ObservableCollection<Producto> Productos { get; set; }

        public LogicaNegocio()
        {
            this.Carreras = new ObservableCollection<Carrera>();
            this.Productos = new ObservableCollection<Producto>();
        }
        //funciona
        public void annadirProductoLista(Producto producto)
        {

            Boolean nuevo = true;
            foreach (var item in Productos)
            {
                if (item.Nombre.Equals(producto.Nombre))
                {
                    nuevo = false;
                }
            }
            if (nuevo == true)
            {

                this.Productos.Add(producto);
                MessageBox.Show("Producto añadido");
            }
        }
        //funciona
        public void borrarProductoLista(int index)
        {
            Boolean borrado = true;
            if (index != -1)
            {
                foreach (var carreraEscogida in Carreras)
                {
                    foreach (var avituallamientoEscogido in carreraEscogida.AvituallamientoDeCarrera)
                    {
                        foreach (var producto in avituallamientoEscogido.Productos)
                        {
                            if (this.Productos[index].Nombre.Equals(producto.Nombre))
                            {
                                MessageBox.Show("No puede eliminar un producto que existe en un avituallamiento");
                                borrado = false;
                            }
                        }
                    }
                }
                if (borrado == true)
                {
                    this.Productos.RemoveAt(index);
                }
            }
        }

        //funciona
        public void annadirProductosAvituallamiento(Producto productoNuevo, ObservableCollection<Producto> listaProductos)
        {
            Boolean nuevo = true;
            foreach (var item in listaProductos)
            {
                if (item.Nombre.Equals(productoNuevo.Nombre))
                {
                    nuevo = false;
                    MessageBox.Show("El producto ya existe");
                }
            }
            if (nuevo == true)
            {

                listaProductos.Add(productoNuevo);
                MessageBox.Show("Producto añadido");
            }
        }
        //funciona
        public void borrarProductoAvituallamiento(int index, ObservableCollection<Producto> listaProductos)
        {
            if (index != -1)
            {
                listaProductos.RemoveAt(index);
            }
        }
        //funciona
        public void crearCarrera(Carrera carrera)
        {
            Boolean nuevo = true;
            foreach (var item in this.Carreras)
            {
                if (item.NombreCarrera.Equals(carrera.NombreCarrera))
                {
                    MessageBox.Show("La carrera ya existe");
                    nuevo = false;
                }
            }
            if (nuevo)
            {
                this.Carreras.Add(carrera);
                MessageBox.Show("Se ha creado la carrera");
            }
        }
        //funciona
        public void annadirAvituallamientoCarrera(Avituallamiento avituallamiento, String nombreCarrera)
        {
            foreach (var item in this.Carreras)
            {
                if (item.NombreCarrera.Equals(nombreCarrera))
                {
                    item.AvituallamientoDeCarrera.Add(avituallamiento);
                }
            }
        }

        //funciona
        public void borrarAvituallamientoCarrera(Carrera carrera, int indexAvituallamiento)
        {
            foreach (var item in carrera.AvituallamientoDeCarrera[indexAvituallamiento].Productos)
            {
                carrera.AvituallamientoDeCarrera[indexAvituallamiento].Productos.Remove(item);
            }
            carrera.AvituallamientoDeCarrera.RemoveAt(indexAvituallamiento);
        }


        public void modificarProductoCarrera(ObservableCollection<Producto> listaProductos, Producto producto, int index)
        {
            listaProductos[index] = producto;
        }
        public void annadirPersonaContacto(Persona persona, Avituallamiento avituallamiento)
        {
            avituallamiento.PersonaContacto = persona;
        }

        public void annadirAvituallamientoCarrera(Carrera carrera, Avituallamiento avituallamiento)
        {
            carrera.AvituallamientoDeCarrera.Add(avituallamiento);
        }
        //
        public void eliminarCarrera(int indexCarrera)
        {
            foreach (var item in this.Carreras[indexCarrera].AvituallamientoDeCarrera)
            {
                this.Carreras[indexCarrera].AvituallamientoDeCarrera.Remove(item);
            }
            this.Carreras.RemoveAt(indexCarrera);
        }
        //
        public void annadirListaProductosAvituallamiento(Avituallamiento avituallamiento, ObservableCollection<Producto> productos)
        {
            avituallamiento.Productos = productos;
        }
    }
}


