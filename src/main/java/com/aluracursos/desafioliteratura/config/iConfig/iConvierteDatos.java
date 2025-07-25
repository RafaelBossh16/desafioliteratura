package com.aluracursos.desafioliteratura.config.iConfig;

public interface iConvierteDatos {
    <T> T convertirDatosJsonAJava(String json, Class<T> clase);
}
