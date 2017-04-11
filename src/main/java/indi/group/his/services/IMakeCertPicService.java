package indi.group.his.services;

import java.io.OutputStream;

public interface IMakeCertPicService {
    String getCerPic(int width, int height, OutputStream os);
}
