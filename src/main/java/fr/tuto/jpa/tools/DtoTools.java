package fr.tuto.jpa.tools;

import org.modelmapper.ModelMapper;

public class DtoTools {

    private static final ModelMapper myMapper = new ModelMapper();

    /**
     * Convert d.
     *
     * @param <S>   the type parameter
     * @param <D>   the type parameter
     * @param obj   the obj
     * @param clazz the clazz
     * @return the d
     */
    public static <S, D> D convert(S obj, Class<D> clazz) {
        return obj == null ? null : myMapper.map(obj, clazz);
    }
}
