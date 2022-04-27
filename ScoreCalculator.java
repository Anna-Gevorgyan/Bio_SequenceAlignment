package algos;

import java.util.List;

import enums.Arrow;

public interface ScoreCalculator {
    int getScore(int row, int col);
    List<Arrow> getArrow(int row, int col);
}
