/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;
import java.util.Objects;

/**
 *
 * @author Danya
 */
public class Model {
    private String _stringField;
    private Long _LongField;

    public Model(String stringField, long longField) {
        _stringField = stringField;
        _LongField = longField;
    }

    public String getStringField() {
        return _stringField;
    }

    public void setStringField(String stringField) {
        _stringField = stringField;
    }

    public Long getLongField() {
        return _LongField;
    }

    public void setLongField(long longField) {
        _LongField = longField;
    }

    @Override
    public String toString() {
        return "Model{" + "StringField=" + _stringField + ", LongField=" + _LongField + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Model other = (Model) obj;
        if (this._LongField != other._LongField)
            return false;
        if (!Objects.equals(this._stringField, other._stringField))
            return false;
        return true;
    }
    
}