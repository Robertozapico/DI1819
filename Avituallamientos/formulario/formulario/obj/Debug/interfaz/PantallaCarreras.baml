   M S B A M L   `   `   `  ����  
formulario*    $formulario.interfaz.PantallaCarreras   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  PantallaCarreras��5   	   $	��300��6"   $	��300��6/   .��5      � .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ tablaCarreras��5         CanUserAddRows .     
IsReadOnly . $
��Left=�6T      AutoGenerateColumns .  $��	10,10,0,0q�6�   $	��Top=�6�   $	��162��6�   $	��272��6�   ��6o   ��  �� Path$ logicaMetodos.Carreras�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre Carrera��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 6=   �� *NombreCarrera+5
      �� 5   
   -   5        	 ��Name$	 btCerrar��5      $��Cerrar��6#   $
��Left=�64   $��216,228,0,0q�6O   $	��Top=�6d   $��42��6|   
 J� RenderTransformOrigin$
 	0.476,0.5&�6�   �� 5   
   -   5        $	 btCrear��5      $��Crear carrera��6"   $
��Left=�6:   $��
10,203,0,0q�6U   $	��Top=�6i   $��82��6�   6�   �� 5   
   -   5        $!	 btGestionarAvituallamientos��5      $��Gestionar Avituallamiento��66   $
��Left=�6Z   $��
97,203,0,0q�6u   $	��Top=�6�   $	��161��6�   6�   �� 5   
   -   5        $	 
btEliminar��5      $��Eliminar carrera��6%   $
��Left=�6@   $��
10,228,0,0q�6[   $	��Top=�6o   $��96��6�   6�   5      5      