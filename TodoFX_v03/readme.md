# TodoFX
## Version 0.3



## Feature
* Version mit SQLite - Datenbank
* Speichern: void save(Todo)
* alle anzeigen:List<Todo> findAll()
* löschen: void deleteById(int id)
* TodoFileDAO: save , findAll aus Datei


## Aufgabe
~~* implementiere TodoFileDAO die Methoden save und findALl~~
~~* implementiere TodoFileDAO deleteById~~
  ~~1. aus List<Todo> löschen nach id~~ 
  ~~2. danach todo.csv neu schreiben~~
  ~~3. > keine Änderung im TodoController notwendig~~ 
1. findAll() (TodoDbDAO) fertig implementieren
    * PreparedStatement mit executeQuery
    * Todo erzeugen
    * Todo Werte schreiben t.setId(rs.getInt())
    * an Liste hängen
    * Liste zurückgeben


## FixMe
* ~~id-Problem: höchste Id ermitteln und neu setzen für save-Todo~~
* DB-Connection bei Programmende