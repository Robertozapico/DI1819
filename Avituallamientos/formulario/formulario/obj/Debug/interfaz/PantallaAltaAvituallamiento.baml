   M S B A M L   `   `   `  ����  
formulario,    &formulario.PantallaAltaAvituallamiento   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$!  PantallaAltaAvituallamiento��5   	   $	��525��6-   $	��525��6:   .��5      � .+�5   
   �� -   5         ��Name$ CarreraPertenece��5      $!��Carrera a la que pertenece:��6*   $
��Left=�6P   $��	10,24,0,0q�6k   $	��Top=�6~    J� RenderTransformOrigin$ 0.474,0.538&�6�   �� 5   
   -   5         ��Name$ TBCarreraPertenece��5      $
��Left=�6�   $��23��6�   $��
184,27,0,0q�6�    �� TextWrapping$
 Wrap=�6  $	��Top=�6  $	��120��61  ��6S   ��  �� Path$, &avituallamiento.CarreraAvituallamiento� �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 61  �� 5   
   -   5        $ LabelPKm��5      $��Punto kilométrico��6"   $
��Left=�6>   $��	10,55,0,0q�6Y   $	��Top=�6l   �� 5	   
   -   5        $ TBPKm��5	      $
��Left=�6�   $��23��6�   $��
184,59,0,0q�6�   $
 Wrap=�6�   $	��Top=�6  $	��120��6  ��6F   �� $&  avituallamiento.PuntoKilometrico� .  . 6  �� 5
   
   -   5        $ LabelPContacto��5
      $��Persona de contacto��6(   $
��Left=�6F   $��	10,86,0,0q�6a   $	��Top=�6t   �� 5   
   -   5        $ LNombre��5      $��Nombre��6!   $
��Left=�62   $��
10,117,0,0q�6M   $	��Top=�6a   $ 0.556,0.538&�6y   �� 5   
   -   5        $ TBNombreContacto��5      $
��Left=�6�   $��23��6�   $��184,121,0,0q�6�   $
 Wrap=�6�   $	��Top=�6   $	��120��6  ��6Q   �� $ persona.Nombre� .  . 6  �� 5   
   -   5        $ 	LabelTlfn��5      $��	Teléfono��6#   $
��Left=�66   $��
10,148,0,0q�6Q   $	��Top=�6e   �� 5   
   -	   5        $ TBTlfn��5      $
��Left=�6�   $��23��6�   $��184,152,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��120��6  ��6G   �� $ persona.Telefono� .  . 6  �� 5   
   -
   5        $ LabelMatDisponible��5      $��Material Disponible��6,   $
��Left=�6J   $��
10,179,0,0q�6e   $	��Top=�6y   �� 5   
   -   5         ��Name$ BtAlta��5      $��Dar de alta��6!   $
��Left=�67   $��184,421,0,0q�6R   $	��103��6g   $��39��6s   $	��Top=�6   6�   �� 5   
   -   5        $ 	btAnnadir��5      $��Añadir Material��6$   $
��Left=�6>   $��184,185,0,0q�6Y   $	��Top=�6n   $	��120��6�   6�   �� 5   
   -   5        $ btEliminarProducto��5      $��Eliminar Producto��6-   $
��Left=�6I   $��
14,350,0,0q�6d   $	��Top=�6x   $	��114��6�   6�   �� 5   
   -   5        $ 
btCancelar��5      $��Cancelar��6%   $
��Left=�68   $��315,421,0,0q�6S   $	��Top=�6h   $��76��6�   $��39��6�   &   System.Windows.Controls.DataGrid  5   
   -   5        	  Name$	 tablaProductos��5      
   CanUserAddRows
 .     
IsReadOnly .    AutoGenerateColumns .  $
��Left=�6�   $��
14,224,0,0q�6�   $	��Top=�6�   $	��104��6�   $	��476��6   ��6T   �� $$ ProductosAvituallamientoActual�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre Producto��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 6>   �� *Nombre+  5      $ Tipo de Producto��6%    6?   �� *Tipo+  5      $ Precio��6%    65   �� *Precio+  5      $ Cantidad��6%    67   �� *
Cantidad+5      5      5      