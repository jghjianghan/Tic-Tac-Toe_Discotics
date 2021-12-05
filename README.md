# Tic Tac Toe_Discotics
Implementasi bot Tic-Tac-Toe perfect dengan Final State(FSM). User dapat bermain melawan bot yang kami buat.

## Program
Program ada di folder Discotics, diimplementasikan dengan Java menggunakan IDE Netbeans.

### States
Dalam program ini, permainan Tic-Tac-Toe dibagi menjadi 2 jenis:
- Play First: jika Bot menjadi pemain pertama.
- Play Second: jika Bot menjadi pemain kedua.

_Game tree_ untuk Tic-Tac-Toe Play First ada di https://www.geogebra.org/m/m2a3qhz7.
_Game tree_ untuk Tic-Tac-Toe Second ada di https://www.geogebra.org/m/mrzkaxpp
_Node_ pada geogebra melanmbangkan _game state_, edge adalah kode _move_ dari musuh, dan _node_ setelahnya adalah _state_ yang dicapai jika bot melakukan aksi yang optimal.

Setiap kode _move_ berkorespondensi dengan 1 cell di papan Tic-Tac-Toe:
Kode<br>
|1|2|3|<br>
|4|5|6|<br>
|7|8|9|<br>

Gambar untuk keadaan pada setiap _state_ ada di folder "States/Play First" dan "States/Play Second".

