Servicio Pago 2
David Alejandro Castiblanco Soler
Andrés Felipe Paipilla Rojas
Andrés Felipe Vinchira
GRUPO Archi

 
Tabla de Ilustraciones
Ilustración 1 Arquitectura General Toures Balón	3
Ilustración 2 Servicio Pago Externo 2	4
Ilustración 3 Diagrama de Componentes UML Servicio Pago Externo 2	5


 
Dentro de la arquitectura general de Toures Balón, el nuevo servicio de Pago Número 2 lo ubicamos en la capa de servicios externos. Dentro del diagrama que se muestra a continuación, vemos reflejada esa capa en color amarillo, en la cual se muestran los diferentes componentes externos de los cuales hace uso la aplicación.
Ilustración 1 Arquitectura General Toures Balón
 
Dentro de nuestra arquitectura de microservicios, vemos reflejado en la siguiente imagen, que el API de Pagos, es el encargado de gestionar todas las peticiones a los servicios externos de Pagos.  En este caso el API pagos tiene la posibilidad de llamar a los servicios externos de Pago Externo 1 y Pago Externo 2.  Pago Externo 2 es un nuevo componente que entra en la arquitectura, el cual proporciona diferentes capacidades para validar pagos con tarjetas.  
Éste nuevo componente está implementado en JAVA y es un API Rest el cual proporciona interactividad por medio de objetos Json.

Ilustración 2 Servicio Pago Externo 2
 
El siguiente diagrama de componentes muestra los componentes internos que conforman el Servicio Externo 2, el cual está conformado por API Rest; es el punto de entrada del servicio encargado de recibir las peticiones HTTP.  API Rest se comunica internamente con un componente DAL encargado de gestionar toda la comunicación con la Base de Datos MySql.
Ilustración 3 Diagrama de Componentes UML Servicio Pago Externo 2
 

