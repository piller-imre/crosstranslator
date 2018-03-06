# Programozási nyelv magas szinten átvihető alkalmazások fejlesztéséhez

*szakdolgozat*

**Feladatkiírás**

A szakdolgozat egy olyan magas szintű programozási nyelv elkészítését mutatja be,
amely a fordítást követően szintén magas szintű programozási nyelvre fordul le.
A dolgozatban sor kerül (az így célnyelvként tekintett) magas szintű programozási nyelvek összehasonlítására,
mivel ez elengedhetetlen a megfelelő nyelv definiálásához.

Ahhoz, hogy a fordítás elvégezhető legyen, szükség van egy keresztfordítóra.
A dolgozat a programozási nyelv bemutatásán túl részletesen kitér a keresztfordító tervezésének, és
implementálásának módjára.

## Bevezetés

* Leírni, hogy milyen problémát és hogy old meg a dolgozat. Hasonló, mint a feladatkiírás, viszont itt a cél az, hogy aki ezt elolvassa, az kedvet kapjon a többi részhez is.
* Itt hangsúlyozni kell a feladat és a megoldás létjogosultságát, tehát hogy így nagyon egyszerűen lehet egy kódot egyidejűleg több platformra is elkészíteni.

## Keresztfordítás

* Leírni a fordítás lépéseit. Ehhez rögtön az elején lehet egy ábra, amit aztán külön pontok részleteznek.
* Meg kell indokolni (röviden), hogy miért az említett nyelvek kerültek kiválasztásra.
* Az esetleges nehézségekre, kihívásokra már itt fel lehet hívni a figyelmet.

## A nyelv definíciója

Ebben a fejezetben kellene definiálni a nyelvet.

* A nyelv szintaktikája
* Vezérlési elemek
* Adattípusok és adatszerkezetek
* Függvények
* Hibakezelés
* ...

## Szintaktikai elemzés

* Ide kerül a szintaktikai elemzés elemzés elterjedt módjainak a bemutatása.
* Ennek a célja az, hogy megállapítsa, hogy érvényes programról van-e szó, illetve hogy majd egyszerűen fa struktúrába rendezhető legyen a program. (AST és CST problémaköre)

## Közbülső reprezentáció

* Az a belső objektum szerkezet, amivel egy betöltött programot a keresztfordító magának ábrázol.
* Itt kellene részletezni majd azt, hogy ez hogy készült el (konkrét implementációs dolgok).

## Célnyelvre fordítás

* Ezt már csak a közbülső reprezentáció és az adott nyelvek viszonyában kell megnézni.
* Itt kellhet majd pretty printer féle. (Elegáns úgy megoldani, hogy opcióként választható legyen.)

## Eredmények értékelése

* Ki kellene választani majd 5-10 algoritmust, amelyikhez egy-egy szakaszban szerepelnek az implementációk, utána pedig az egyes nyelvekre való fordítással kapcsolatos észrevételek, futási idők.

## Irodalomjegyzék

* Principles of Compiler Design
* Formális nyelvek és automaták

