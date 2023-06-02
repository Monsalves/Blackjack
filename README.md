# Blackjack
Felipe Monsalves


Descripción:
Tenemos la clase carta la cual define todos los atributos de la carta(pinta,color,numero,valor de juego),
a se vez la clase baraja está compuesta por un Arraylist de cartas, en la baraja podemos mezclar las cartas, luego
en la clase Jugador, tenemos como atributo el nombre, el puntaje, y su mano de cartas(arraylist), también tiene la funcionalidad de poder
agregar cartas a su mano.

Luego en la clase BlackJack, sucede todo el juego, la clase tiene como atributos dos arraylist, uno para las cartas que se usarán y otro
para los jugadores(2).

primero creamos una baraja de tipo Baraja y luego usamos su metodo get para asignar esas cartas a el Arraylist que guarda las cartas.
luego creamos a los 2 jugadores, uno es el del usario y este debe ingresar su nombre, también hay un jugador genérico que es como "el bot",
ambos jugadores se guardarán en el array de "jugadores".

luego sacamos 3 cartas del array y se las agregamos a los jugadores.
luego calculamos el puntaje de cada mano del jugador al revisar su mano y hacer uso de la función "getValorJuego" de la Clase Carta.
luego se usan if -else , comparando el valor de la mano de cada jugador , para posteriormente imprimir el ganador del encuentro.

