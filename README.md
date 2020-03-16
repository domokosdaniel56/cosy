![Java CI with Maven](https://github.com/domokosdaniel56/cosy/workflows/Java%20CI%20with%20Maven/badge.svg)

# Cosy - Otthoni nyilvántartó rendszer
## Rendszer célja
Az otthon található eszközök szabályos és jól nyomon követhető rendszerbe szedése és más egyéb ügyintézések folyamatának nyilvántartása.
## Környezet tulajdonságai
A rendszer kezelő felülete egy URL-en keresztül elérhető szoftver, amely későbbiekben bármilyen eszközön jól kezelhető (mobil, tablet, stb.). Elsőnek számítógépes megvalósítás javasolt.
## Használt fejlesztői eszközök

Spring Tools 4
https://spring.io/tools

Thymeleaf - Templating engine
https://www.thymeleaf.org/

Spring Boot
https://spring.io/projects/spring-boot


## Rendszer felépítése
A weboldal egy főmenüről navigálná át a felhasználót az egyes nyilvántartásokhoz, funkciókhoz. Érdemes lenne az egyes alrendszereket modulokba gyűjteni, hogy a későbbiekben egy-egy új funkció hozzáadása a szoftverhez kényelmes maradjon. Az adatok tárolása egy adatbázison történik.
Ötletek funkciókhoz:
* Otthoni eszközök nyilvántartása - a házban, ház körül található kisebb nagyobb eszközök pontos leírása, ha csere vagy romlott eszköz esetén könnyebb legyen a helyettesítés, esetleg rendelni is lehessen?
* Pénzügy elemző - a felvitt adatokból statisztikák és "Látványos" diagramok, kimutatások készíthetők
* Fali fórum - jegyzetek a család többi tagjának a napi teendőkről, emlékezetetők készítése
* Otthoni könyvtár - a házban található könyvek listája és hol találhatók
* Tudásbázis - oktatással kapcsolatos fontosabb tudnivalók, esetleg feladat megoldók stb.
* Hasznos linkek - a család számára fontos linkek listája leírással
Ezek kapcsán felmerült egy alaprajz építő és linkelő modul, amellyel meg lehet építeni a ház vázlatos tervrajzát és hozzá lehetne linkeleni különböző kijelölt helyeket. Például egy tipikus villanykörte fajta ebben a szobában található.
