   M S B A M L   `   `   `  ����  
formulario!    formulario.PantallaProducto   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  Window1��5   	   $	��315��6   $��325.5��6&   .��5      � .+�5   
   �� -   5         ��Name$ labelNombreProducto��5      $��Nombre producto��6-   $
��Left=�6G   $��	10,21,0,0q�6b   $	��Top=�6u   �� 5   
   -   5        $ LabelTipoProducto��5      $
��Tipo��6+   $
��Left=�6:   $��	10,73,0,0q�6U   $	��Top=�6h   �� 5   
   -   5        $ LabelPrecio��5      $��Precio��6%   $
��Left=�66   $��
10,116,0,0q�6Q   $	��Top=�6e   �� 5	   
   -   5         ��Name$ TBNombreProducto��5	      $
��Left=�6�   $��23��6�   $��
134,25,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6  $	��120��6  ��6Q   ��  �� Path$ productoNuevo.Nombre� �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6  �� 5
   
   -   5        $ TBPrecio��5
      $
��Left=�6�   $��23��6�   $��134,120,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��120��6  ��6I   �� $ productoNuevo.Precio� .  . 6  �� 5   
   -   5         ��Name$ 	btAnnadir��5      $��Aceptar��6$   $
��Left=�66   $��
44,214,0,0q�6Q   $	��Top=�6e   $��98��6}   6�   �� 5   
   -   5        $ 
btCancelar��5      $��Cancelar��6%   $
��Left=�68   $��166,214,0,0q�6S   $	��Top=�6h   $��74��6�   6�   �� 5   
   -   5         ��Name$ cbTipo��5      $
��Left=�6�   $��
134,77,0,0q�6�   $	��Top=�6�   $	��120��6�   ��6I   �� $ tiposProductos�	 �� SelectedItem	 6u   �� $ productoNuevo.Tipo�6�   �� 5   
   -	   5        $ 
lbCantidad��5      $��Cantidad��6$   $
��Left=�67   $��
15,161,0,0q�6R   $	��Top=�6f   $	��101��6~   �� 5   
   -
   5        $ 
TBCantidad��5      $
��Left=�6�   $��23��6�   $��134,164,0,0q�6�   $
 Wrap=�6�   $	��Top=�6  $	��120��6  ��6K   �� $ productoNuevo.Cantidad� .  . 6  5      5      