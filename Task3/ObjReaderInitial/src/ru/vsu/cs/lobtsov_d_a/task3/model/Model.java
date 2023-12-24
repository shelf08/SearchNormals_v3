package ru.vsu.cs.lobtsov_d_a.task3.model;
import ru.vsu.cs.lobtsov_d_a.task3.math.Vector2f;
import ru.vsu.cs.lobtsov_d_a.task3.math.Vector3f;

import java.util.*;

public class Model {

    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}
