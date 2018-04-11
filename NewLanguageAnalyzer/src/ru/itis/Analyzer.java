package ru.itis;

public class Analyzer {
    private int state;

    public void analyze(String input) {
        state = 0;
        if (input == null)
            return;
        for (int i = 0; i < input.length(); i++) {
            char num = input.charAt(i);
            switch (state) {
                case (0): {
                    if (num < 'A' || num > 'Z')
                        throw new SyntaxException();
                    state = 1;
                    break;
                }
                case (1): {
                    if ((num >= '0' && num <= '9')) {
                        state = 2;
                    } else
                        throw new SyntaxException();
                    break;
                }
                case (2): {
                    if (num != ':')
                        throw new SyntaxException();
                    state = 3;
                    break;
                }
                case (3): {
                    if (num != '=')
                        throw new SyntaxException();
                    state = 4;
                    break;
                }
                case (4): {
                    if (num >= '0' && num <= '9') {
                        state = 5;
                    } else {
                        if (num >= 'A' && num <= 'Z') {
                            state = 6;
                            break;
                        } else if (num != '-')
                            throw new SyntaxException();
                    }
                    break;
                }
                case (5): {
                    if (num == ';') {
                        state = 0;
                    } else {
                        if (num < '0' || num > '9')
                            throw new SyntaxException();
                    }
                    break;
                }
                case (6): {
                    if (num >= '0' && num <= '9') {
                        state = 7;
                        break;
                    }
                    throw new SyntaxException();
                }
                case (7): {
                    if (num == '+' || num == '-' || num == '*' || num == '/') {
                        state = 4;
                    } else {
                        if (num == ';')
                            state = 0;
                        else
                            throw new SyntaxException();
                    }
                    break;
                }
            }
        }
        if (state != 0)
            throw new SyntaxException();
    }

    public int getState() {
        return state;
    }
}
