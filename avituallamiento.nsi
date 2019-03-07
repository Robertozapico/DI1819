# Idiomas

# Nombre del instalador
Name "Instalador de Roberto"

# The file to write
OutFile "Roberto.exe"

# The default installation directory
InstallDir $PROGRAMFILES\Roberto

# Pedimos permisos para Windows 7
RequestExecutionLevel admin

# Pantallas que hay que mostrar del instalador

Page directory
Page instfiles

#Cambiar el idioma
!include "MUI.nsh"
!insertmacro MUI_PAGE_INSTFILES
!insertmacro MUI_LANGUAGE "Spanish"

#Seccion principal
Section

  # Establecemos el directorio de salida al directorio de instalacion
  SetOutPath $INSTDIR
  
  # Creamos el desinstalador
  writeUninstaller "$INSTDIR\uninstall.exe"

  # Ponemos ahi el archivo test.txt
  File formulario.exe
  createShortCut "$SMPROGRAMS\AvituallamientosRoberto.lnk" "$INSTDIR\formulario.exe"
  createShortCut "$DESKTOP\AvituallamientosRoberto.lnk" "$INSTDIR\formulario.exe"
  createShortCut "$SMPROGRAMS\DesinstalarAvituallamientos.lnk" "$INSTDIR\uninstall.exe"
   
  
# Fin de la seccion
SectionEnd

# seccion del desintalador
section "uninstall"
 
    # borramos el desintalador primero
	delete "$INSTDIR\formulario.exe"
    delete "$INSTDIR\uninstall.exe"
 
    # borramos el acceso directo del menu de inicio
    delete "$INSTDIR\formulario.exe"
    delete "$SMPROGRAMS\Roberto.lnk"
    delete "$DESKTOP\Roberto.lnk"	
	delete "$SMPROGRAMS\DesinstalarAvituallamientos.lnk"
    RmDir "$INSTDIR"
 
	#Borramos la entrada del registro
	DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Roberto"
 
# fin de la seccion del desinstalador
sectionEnd
