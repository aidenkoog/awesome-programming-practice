package io.github.aidenkoog.androidpractice.design_pattern;

import androidx.annotation.NonNull;

/*
 * 책임 떠넘기기
 * 요청을 해결할 객체를 만날 때까지 객체 고리를 따라서 요청을 전달
 * 요청의 근원지는 모를 수 있음
 * 객체의 책임을 추가 / 변경 / 확장 가능
 * ex. object.setNext(..).setNext(..)... / object.support(new Problem(100))
 * ex. Help 시스템 - 적절한 답을 찾을 때까지 연결되어 해결 가능
 */
class ChainOfResponsibility {

}

abstract class Support {
    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    // setter for next supporter.
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Object trouble) {
        if (resolve(trouble)) {
            done();
        } else if (next != null) {
            // support function is called using next object.
            next.support(trouble);
        } else {
            fail();
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Object trouble);

    abstract void done();

    abstract void fail();
}
