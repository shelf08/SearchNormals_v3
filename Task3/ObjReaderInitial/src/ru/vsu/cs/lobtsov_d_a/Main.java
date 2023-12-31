package ru.vsu.cs.lobtsov_d_a;

import ru.vsu.cs.lobtsov_d_a.model.Model;
import ru.vsu.cs.lobtsov_d_a.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("3DModels/SimpleModelsForReaderTests/Teapot.obj");
//        Path fileName = Path.of("3DModels/Faceform/WrapBody.obj");
        String fileContent = Files.readString(fileName);

        System.out.println("Model - " + fileName);
        Model model = ObjReader.read(fileContent);


        System.out.println("Vertices: " + model.vertices.size());
        System.out.println("Texture vertices: " + model.textureVertices.size());
        System.out.println("Normals: " + model.normals.size());
        System.out.println("Polygons: " + model.polygons.size());

    }
}
