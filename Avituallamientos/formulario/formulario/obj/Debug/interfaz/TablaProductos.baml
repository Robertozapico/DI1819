   M S B A M L   `   `   `  ����  
formulario(    "formulario.interfaz.TablaProductos   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  TablaProductos��5   	   $	��323��6    $	��375��6-   .��5      �  � RowDefinitions 5   
   �� 5      $
��101* �6   �� 5      $
��168* �6   .+�5
   
   &   System.Windows.Controls.DataGrid  -   5          Name$ tablaProductosExistentes��5
         CanUserAddRows .     
IsReadOnly .    AutoGenerateColumns .  $��
10,10,26,0q�6�   $��2��6�   $	��180��6�   $	��Top=�6�   ��6^   ��  �� Path$ logicaMetodos.Productos�   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre Producto��6%   1  +System.Windows.Controls.DataGridBoundColumn	   Binding	 6>   �� *Nombre+  5      $ Tipo de Producto��6%   	 6?   �� *Tipo+  5      $ Precio��6%   	 65   �� *Precio+  5      $ Cantidad��6%   	 67   �� *
Cantidad+5      �� 5   
   -   5        
 ��Name$
 	btAnnadir��5      $��Añadir��6$   $
��Left=�65   $��
25,125,0,0q�6P   $��1��6d   $��75��6q   $��20��6|   $	��Top=�6�   6�   �� 5   
   -   5        $
 btCerrar��5      $��Cerrar��6#   $
��Left=�64   $��217,125,0,0q�6O   $��1��6d   $��75��6q   $��20��6|   $	��Top=�6�   6�   5      5      