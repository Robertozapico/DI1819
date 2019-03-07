# Idiomas

# Nombre del instalador
Name "Instalador Gestion Corredores Roberto"

# The file to write
OutFile "GestionCorredoresRoberto.exe"

# The default installation directory
InstallDir $PROGRAMFILES\GestionCorredoresRoberto

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

  # Ponemos ahi el archivo
  File DiGrafico.jar
  File /r "lib"
  File /r "reports"
  File /r "help"
  File "gestionCarreras.dat"
  createShortCut "$SMPROGRAMS\GestionCorredoresRoberto.lnk" "$INSTDIR\DiGrafico.jar"
  createShortCut "$DESKTOP\GestionCorredoresRoberto.lnk" "$INSTDIR\DiGrafico.jar"
  createShortCut "$SMPROGRAMS\DesinstalarGestionCorredoresRoberto.lnk" "$INSTDIR\uninstall.exe"
   
  
# Fin de la seccion
SectionEnd

# seccion del desintalador
section "uninstall"
 
    # borramos el desintalador primero
	delete "$INSTDIR\DiGrafico.jar"
    delete "$INSTDIR\uninstall.exe"
 
    # borramos el acceso directo del menu de inicio
    delete "$INSTDIR\DiGrafico.jar"
	delete "$INSTDIR\gestionCarreras.dat"
	RmDir /r "$INSTDIR\lib"
    RmDir /r "$INSTDIR\reports"
    RmDir /r "$INSTDIR\help"
    delete "$SMPROGRAMS\GestionCorredoresRoberto.lnk"
    delete "$DESKTOP\GestionCorredoresRoberto.lnk"	
	delete "$SMPROGRAMS\DesinstalarGestionCorredoresRoberto.lnk"
    RmDir "$INSTDIR"
 
	#Borramos la entrada del registro
	DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\GestionCorredoresRoberto"
 
# fin de la seccion del desinstalador
sectionEnd
