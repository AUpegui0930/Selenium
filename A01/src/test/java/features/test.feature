Feature: Categoria Empleos
	Como usuario quiero ingresar a la opcion de empleos.
Scenario: Ingresar a la categoria de empleos desde la pagina inicial
	Given el usuario se encuentra en la pagina inicial de Choucair
	When hace click sobre el menu sobre la opcion de empleos	
	Then se debe redirigir a la pantalla de empleos