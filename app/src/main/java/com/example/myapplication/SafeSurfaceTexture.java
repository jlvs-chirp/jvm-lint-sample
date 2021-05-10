package com.example.myapplication;

import android.graphics.SurfaceTexture;

import org.jetbrains.annotations.NotNull;

public class SafeSurfaceTexture extends SurfaceTexture {

	@NotNull private final String x;

    public SafeSurfaceTexture(int texName) {
        super(texName);
        x = "abc";
    }

    public SafeSurfaceTexture(int texName, boolean singleBufferMode) {
        super(texName, singleBufferMode);
        x = "def";
    }

}