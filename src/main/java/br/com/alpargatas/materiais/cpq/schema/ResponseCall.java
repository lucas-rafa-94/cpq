package br.com.alpargatas.materiais.cpq.schema;

import java.util.Objects;

public class ResponseCall {

    private String status;

    public ResponseCall(String status) {
        this.status = status;
    }

    public ResponseCall() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseCall)) return false;
        ResponseCall that = (ResponseCall) o;
        return Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus());
    }
}
