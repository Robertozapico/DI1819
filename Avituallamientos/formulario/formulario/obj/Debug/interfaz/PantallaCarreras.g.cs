﻿#pragma checksum "..\..\..\interfaz\PantallaCarreras.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "C5E4649001E34A95DE435C4B03CAF7D0C7AF43F0"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace formulario.interfaz {
    
    
    /// <summary>
    /// PantallaCarreras
    /// </summary>
    public partial class PantallaCarreras : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 6 "..\..\..\interfaz\PantallaCarreras.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DataGrid tablaCarreras;
        
        #line default
        #line hidden
        
        
        #line 11 "..\..\..\interfaz\PantallaCarreras.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btCerrar;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\..\interfaz\PantallaCarreras.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btCrear;
        
        #line default
        #line hidden
        
        
        #line 13 "..\..\..\interfaz\PantallaCarreras.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btGestionarAvituallamientos;
        
        #line default
        #line hidden
        
        
        #line 14 "..\..\..\interfaz\PantallaCarreras.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btEliminar;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/formulario;component/interfaz/pantallacarreras.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\interfaz\PantallaCarreras.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.tablaCarreras = ((System.Windows.Controls.DataGrid)(target));
            
            #line 6 "..\..\..\interfaz\PantallaCarreras.xaml"
            this.tablaCarreras.SelectionChanged += new System.Windows.Controls.SelectionChangedEventHandler(this.tablaCarreras_SelectionChanged);
            
            #line default
            #line hidden
            return;
            case 2:
            this.btCerrar = ((System.Windows.Controls.Button)(target));
            
            #line 11 "..\..\..\interfaz\PantallaCarreras.xaml"
            this.btCerrar.Click += new System.Windows.RoutedEventHandler(this.btCerrar_Click);
            
            #line default
            #line hidden
            return;
            case 3:
            this.btCrear = ((System.Windows.Controls.Button)(target));
            
            #line 12 "..\..\..\interfaz\PantallaCarreras.xaml"
            this.btCrear.Click += new System.Windows.RoutedEventHandler(this.btCrear_Click);
            
            #line default
            #line hidden
            return;
            case 4:
            this.btGestionarAvituallamientos = ((System.Windows.Controls.Button)(target));
            
            #line 13 "..\..\..\interfaz\PantallaCarreras.xaml"
            this.btGestionarAvituallamientos.Click += new System.Windows.RoutedEventHandler(this.btGestionarAvituallamientos_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            this.btEliminar = ((System.Windows.Controls.Button)(target));
            
            #line 14 "..\..\..\interfaz\PantallaCarreras.xaml"
            this.btEliminar.Click += new System.Windows.RoutedEventHandler(this.btEliminar_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

