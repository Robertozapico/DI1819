   M S B A M L   `   `   `  ����  
formulario*    $formulario.interfaz.gestionProductos   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  gestionProductos��5   	   $	��301��6"   $	��407��6/   .��5      � .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ tablaProductos��5         CanUserAddRows .     
IsReadOnly .    AutoGenerateColumns .  $
��Left=�6�   $��	10,10,0,0q�6�   $	��Top=�6�   $	��149��6�   $	��326��6�   ��6T   ��  �� Path$ logicaMetodos.Productos�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre Producto��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 6>   �� *Nombre+  5	      $ Tipo de Producto��6%    6?   �� *Tipo+  5
      $ Precio��6%    65   �� *Precio+  5      $ Cantidad��6%    67   �� *
Cantidad+5      �� 5   
   -   5        	 ��Name$	 	btAnnadir��5      $��Añadir��6$   $
��Left=�65   $��	10,0,0,59q�6P   $��75��6c   $��20��6n   $��Bottom=�6z   6�   �� 5   
   -   5        $	 
btEliminar��5      $��Eliminar��6%   $
��Left=�68   $��
110,0,0,59q�6S   $��75��6g   $��20��6r   $��Bottom=�6~   6�   �� 5   
   -   5        $	 	btCerrrar��5      $��Cerrar��6$   $
��Left=�65   $��
207,0,0,59q�6P   $��75��6d   $��20��6o   $��Bottom=�6{   6�   5      5      