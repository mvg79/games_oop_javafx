package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void positionRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(A1));
    }

    @Test
    public void copyRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.copy(Cell.A1).position(), is(A1));
    }

    @Test
    public void wayRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{D2, E3, F4, G5}));
    }

    @Test
    public void isNotDiagonal() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(C1);
        bishopBlack.isDiagonal(C1, D5);
    }
}