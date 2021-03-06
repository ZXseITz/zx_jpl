package ch.zxseitz.j3de.window;

import static org.lwjgl.glfw.GLFW.*;

public enum Key {
    UNKNOWN,
    ESC,
    CTRL_LEFT,
    CTRL_RIGHT,
    SHIFT_LEFT,
    SHIFT_RIGHT,
    ALT_LEFT,
    ALT_RIGHT,
    ENTER,
    SPACE,
    TAB,
    CAPS_LOCK,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z,
    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE;

    public static Key fromValue(int value) {
        return switch(value) {
            case GLFW_KEY_ESCAPE -> ESC;
            case GLFW_KEY_LEFT_CONTROL -> CTRL_LEFT;
            case GLFW_KEY_RIGHT_CONTROL -> CTRL_RIGHT;
            case GLFW_KEY_LEFT_SHIFT -> SHIFT_LEFT;
            case GLFW_KEY_RIGHT_SHIFT -> SHIFT_RIGHT;
            case GLFW_KEY_LEFT_ALT -> ALT_LEFT;
            case GLFW_KEY_RIGHT_ALT -> ALT_RIGHT;
            case GLFW_KEY_ENTER -> ENTER;
            case GLFW_KEY_SPACE -> SPACE;
            case GLFW_KEY_TAB -> TAB;
            case GLFW_KEY_CAPS_LOCK -> CAPS_LOCK;
            case GLFW_KEY_A -> A;
            case GLFW_KEY_B -> B;
            case GLFW_KEY_C -> C;
            case GLFW_KEY_D -> D;
            case GLFW_KEY_E -> E;
            case GLFW_KEY_F -> F;
            case GLFW_KEY_G -> G;
            case GLFW_KEY_H -> H;
            case GLFW_KEY_I -> I;
            case GLFW_KEY_J -> J;
            case GLFW_KEY_K -> K;
            case GLFW_KEY_L -> L;
            case GLFW_KEY_M -> M;
            case GLFW_KEY_N -> N;
            case GLFW_KEY_O -> O;
            case GLFW_KEY_P -> P;
            case GLFW_KEY_Q -> Q;
            case GLFW_KEY_R -> R;
            case GLFW_KEY_S -> S;
            case GLFW_KEY_T -> T;
            case GLFW_KEY_U -> U;
            case GLFW_KEY_V -> V;
            case GLFW_KEY_W -> W;
            case GLFW_KEY_X -> X;
            case GLFW_KEY_Y -> Y;
            case GLFW_KEY_Z -> Z;
            case GLFW_KEY_0 -> ZERO;
            case GLFW_KEY_1 -> ONE;
            case GLFW_KEY_2 -> TWO;
            case GLFW_KEY_3 -> THREE;
            case GLFW_KEY_4 -> FOUR;
            case GLFW_KEY_5 -> FIVE;
            case GLFW_KEY_6 -> SIX;
            case GLFW_KEY_7 -> SEVEN;
            case GLFW_KEY_8 -> EIGHT;
            case GLFW_KEY_9 -> NINE;
            default -> UNKNOWN;
        };
    }
}
