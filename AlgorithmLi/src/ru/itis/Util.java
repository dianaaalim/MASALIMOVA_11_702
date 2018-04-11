package ru.itis;

import java.util.LinkedList;

public class Util {
    private static final int M = 10;
    private static final int N = 10;

    private static final int row[] = {-1, 0, 0, 1};
    private static final int col[] = {0, -1, 1, 0};

    private static boolean isValid(int mat[][], boolean visited[][], int row, int col) {
        return (row >= 0) && (row < M) && (col >= 0) && (col < N) && mat[row][col] == 1 && !visited[row][col];
    }

    public static void BFS(int mat[][], int i, int j, int x, int y) {
        boolean[][] visited = new boolean[M][N];

        LinkedList<Node> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new Node(i, j, 0));
        int min_dist = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            Node node = q.removeLast();

            i = node.x;
            j = node.y;
            int dist = node.dist;
            if (i == x && j == y) {
                min_dist = dist;
                break;
            }
            for (int k = 0; k < 4; k++) {
                if (isValid(mat, visited, i + row[k], j + col[k])) {
                    visited[i + row[k]][j + col[k]] = true;
                    q.add(new Node(i + row[k], j + col[k], dist + 1));
                }
            }
        }
        if (min_dist != Integer.MAX_VALUE) {
            System.out.print("The shortest path from source to destination " + "has length " + min_dist);
        } else {
            System.out.print("Destination can't be reached from given source");
        }
    }
}
