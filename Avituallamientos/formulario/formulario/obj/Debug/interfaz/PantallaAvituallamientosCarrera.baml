   M S B A M L   `   `   `  ����  
formulario9    3formulario.interfaz.PantallaAvituallamientosCarrera   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$%  PantallaAvituallamientosCarrera��5   	   $	��338��61   $	��438��6>   .��5      � $��0,0,2,10q�6   .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ tablaAvituallamientos��5         CanUserAddRows .     
IsReadOnly .    AutoGenerateColumns .  $
��Left=�6�   $��	42,86,0,0q�6�   $	��Top=�6�   $��97��6  $	��346��6  ��6[   ��  �� Path$. (carreraEscogida.AvituallamientoDeCarrera�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Km Avituallamiento��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 6A   �� *PuntoKilometrico+  5	      $ Nombre responsable��6%    6A   �� *PersonaContacto.Nombre+  5
      $ Tlf responsable��6%    6>   �� *PersonaContacto.Telefono+5      �� 5   
   -   5        	 ��Name$	 btCerrar��5      $��Cerrar��6#   $
��Left=�64   $��322,240,0,0q�6O   $	��Top=�6d   $��75��6|   6�   �� 5   
   -   5        $	 btModificar��5      $��	Modificar��6&   $
��Left=�6:   $��
42,240,0,0q�6U   $	��Top=�6i   $��75��6�   6�   �� 5   
   -   5        $	 
btEliminar��5      $��Eliminar��6%   $
��Left=�68   $��174,240,0,0q�6S   $	��Top=�6h   $��75��6�   6�   5      5      