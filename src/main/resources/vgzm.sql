PGDMP         ;                {           vgzm    15.2    15.2 >    K           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            L           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            M           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            N           1262    16398    vgzm    DATABASE     �   CREATE DATABASE vgzm WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United Kingdom.1252';
    DROP DATABASE vgzm;
                postgres    false            �            1259    24715    line813    TABLE     �   CREATE TABLE public.line813 (
    bus_stop_id integer NOT NULL,
    stop_name text,
    stop_time text,
    trip_index_id integer NOT NULL,
    line_number_id integer NOT NULL
);
    DROP TABLE public.line813;
       public         heap    postgres    false            �            1259    24749 	   firstview    VIEW     �   CREATE VIEW public.firstview AS
 SELECT line813.bus_stop_id,
    line813.stop_name,
    line813.stop_time,
    line813.trip_index_id,
    line813.line_number_id
   FROM public.line813;
    DROP VIEW public.firstview;
       public          postgres    false    227    227    227    227    227            �            1259    24714    line813_l813_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813_l813_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.line813_l813_id_seq;
       public          postgres    false    227            O           0    0    line813_l813_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.line813_l813_id_seq OWNED BY public.line813.bus_stop_id;
          public          postgres    false    226            �            1259    24662    line813trip101    TABLE     ~   CREATE TABLE public.line813trip101 (
    id integer NOT NULL,
    stop_name text,
    stop_time text,
    trips_id integer
);
 "   DROP TABLE public.line813trip101;
       public         heap    postgres    false            �            1259    24661    line813trip101_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip101_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.line813trip101_id_seq;
       public          postgres    false    225            P           0    0    line813trip101_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.line813trip101_id_seq OWNED BY public.line813trip101.id;
          public          postgres    false    224            �            1259    24610    line813trip102    TABLE     h   CREATE TABLE public.line813trip102 (
    id integer NOT NULL,
    stop_name text,
    stop_time text
);
 "   DROP TABLE public.line813trip102;
       public         heap    postgres    false            �            1259    24609    line813trip102route1_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip102route1_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.line813trip102route1_id_seq;
       public          postgres    false    215            Q           0    0    line813trip102route1_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.line813trip102route1_id_seq OWNED BY public.line813trip102.id;
          public          postgres    false    214            �            1259    24619    line813trip103    TABLE     h   CREATE TABLE public.line813trip103 (
    id integer NOT NULL,
    stop_name text,
    stop_time text
);
 "   DROP TABLE public.line813trip103;
       public         heap    postgres    false            �            1259    24618    line813trip103route1_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip103route1_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.line813trip103route1_id_seq;
       public          postgres    false    217            R           0    0    line813trip103route1_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.line813trip103route1_id_seq OWNED BY public.line813trip103.id;
          public          postgres    false    216            �            1259    24628    line813trip104    TABLE     h   CREATE TABLE public.line813trip104 (
    id integer NOT NULL,
    stop_name text,
    stop_time text
);
 "   DROP TABLE public.line813trip104;
       public         heap    postgres    false            �            1259    24627    line813trip104route1_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip104route1_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.line813trip104route1_id_seq;
       public          postgres    false    219            S           0    0    line813trip104route1_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.line813trip104route1_id_seq OWNED BY public.line813trip104.id;
          public          postgres    false    218            �            1259    24637    line813trip105    TABLE     h   CREATE TABLE public.line813trip105 (
    id integer NOT NULL,
    stop_name text,
    stop_time text
);
 "   DROP TABLE public.line813trip105;
       public         heap    postgres    false            �            1259    24636    line813trip105route1_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip105route1_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.line813trip105route1_id_seq;
       public          postgres    false    221            T           0    0    line813trip105route1_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.line813trip105route1_id_seq OWNED BY public.line813trip105.id;
          public          postgres    false    220            �            1259    24646    line813trip106    TABLE     h   CREATE TABLE public.line813trip106 (
    id integer NOT NULL,
    stop_name text,
    stop_time text
);
 "   DROP TABLE public.line813trip106;
       public         heap    postgres    false            �            1259    24645    line813trip106_id_seq    SEQUENCE     �   CREATE SEQUENCE public.line813trip106_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.line813trip106_id_seq;
       public          postgres    false    223            U           0    0    line813trip106_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.line813trip106_id_seq OWNED BY public.line813trip106.id;
          public          postgres    false    222            �            1259    24728    lines    TABLE     Y   CREATE TABLE public.lines (
    line_number_id integer NOT NULL,
    line_number text
);
    DROP TABLE public.lines;
       public         heap    postgres    false            �            1259    24723    trips    TABLE     Z   CREATE TABLE public.trips (
    trip_index_id integer NOT NULL,
    trip_index integer
);
    DROP TABLE public.trips;
       public         heap    postgres    false            �           2604    24718    line813 bus_stop_id    DEFAULT     v   ALTER TABLE ONLY public.line813 ALTER COLUMN bus_stop_id SET DEFAULT nextval('public.line813_l813_id_seq'::regclass);
 B   ALTER TABLE public.line813 ALTER COLUMN bus_stop_id DROP DEFAULT;
       public          postgres    false    226    227    227            �           2604    24665    line813trip101 id    DEFAULT     v   ALTER TABLE ONLY public.line813trip101 ALTER COLUMN id SET DEFAULT nextval('public.line813trip101_id_seq'::regclass);
 @   ALTER TABLE public.line813trip101 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    225    224    225            �           2604    24613    line813trip102 id    DEFAULT     |   ALTER TABLE ONLY public.line813trip102 ALTER COLUMN id SET DEFAULT nextval('public.line813trip102route1_id_seq'::regclass);
 @   ALTER TABLE public.line813trip102 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            �           2604    24622    line813trip103 id    DEFAULT     |   ALTER TABLE ONLY public.line813trip103 ALTER COLUMN id SET DEFAULT nextval('public.line813trip103route1_id_seq'::regclass);
 @   ALTER TABLE public.line813trip103 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    217    217            �           2604    24631    line813trip104 id    DEFAULT     |   ALTER TABLE ONLY public.line813trip104 ALTER COLUMN id SET DEFAULT nextval('public.line813trip104route1_id_seq'::regclass);
 @   ALTER TABLE public.line813trip104 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    218    219    219            �           2604    24640    line813trip105 id    DEFAULT     |   ALTER TABLE ONLY public.line813trip105 ALTER COLUMN id SET DEFAULT nextval('public.line813trip105route1_id_seq'::regclass);
 @   ALTER TABLE public.line813trip105 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    221    221            �           2604    24649    line813trip106 id    DEFAULT     v   ALTER TABLE ONLY public.line813trip106 ALTER COLUMN id SET DEFAULT nextval('public.line813trip106_id_seq'::regclass);
 @   ALTER TABLE public.line813trip106 ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    223    222    223            F          0    24715    line813 
   TABLE DATA           c   COPY public.line813 (bus_stop_id, stop_name, stop_time, trip_index_id, line_number_id) FROM stdin;
    public          postgres    false    227   �D       D          0    24662    line813trip101 
   TABLE DATA           L   COPY public.line813trip101 (id, stop_name, stop_time, trips_id) FROM stdin;
    public          postgres    false    225   bG       :          0    24610    line813trip102 
   TABLE DATA           B   COPY public.line813trip102 (id, stop_name, stop_time) FROM stdin;
    public          postgres    false    215   
J       <          0    24619    line813trip103 
   TABLE DATA           B   COPY public.line813trip103 (id, stop_name, stop_time) FROM stdin;
    public          postgres    false    217   �K       >          0    24628    line813trip104 
   TABLE DATA           B   COPY public.line813trip104 (id, stop_name, stop_time) FROM stdin;
    public          postgres    false    219   �L       @          0    24637    line813trip105 
   TABLE DATA           B   COPY public.line813trip105 (id, stop_name, stop_time) FROM stdin;
    public          postgres    false    221   3N       B          0    24646    line813trip106 
   TABLE DATA           B   COPY public.line813trip106 (id, stop_name, stop_time) FROM stdin;
    public          postgres    false    223   P       H          0    24728    lines 
   TABLE DATA           <   COPY public.lines (line_number_id, line_number) FROM stdin;
    public          postgres    false    229   Q       G          0    24723    trips 
   TABLE DATA           :   COPY public.trips (trip_index_id, trip_index) FROM stdin;
    public          postgres    false    228   |Q       V           0    0    line813_l813_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.line813_l813_id_seq', 58, true);
          public          postgres    false    226            W           0    0    line813trip101_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.line813trip101_id_seq', 57, true);
          public          postgres    false    224            X           0    0    line813trip102route1_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.line813trip102route1_id_seq', 32, true);
          public          postgres    false    214            Y           0    0    line813trip103route1_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.line813trip103route1_id_seq', 8, true);
          public          postgres    false    216            Z           0    0    line813trip104route1_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.line813trip104route1_id_seq', 19, true);
          public          postgres    false    218            [           0    0    line813trip105route1_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.line813trip105route1_id_seq', 32, true);
          public          postgres    false    220            \           0    0    line813trip106_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.line813trip106_id_seq', 11, true);
          public          postgres    false    222            �           2606    24722    line813 line813_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.line813
    ADD CONSTRAINT line813_pkey PRIMARY KEY (bus_stop_id);
 >   ALTER TABLE ONLY public.line813 DROP CONSTRAINT line813_pkey;
       public            postgres    false    227            �           2606    24669 "   line813trip101 line813trip101_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.line813trip101
    ADD CONSTRAINT line813trip101_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.line813trip101 DROP CONSTRAINT line813trip101_pkey;
       public            postgres    false    225            �           2606    24617 (   line813trip102 line813trip102route1_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.line813trip102
    ADD CONSTRAINT line813trip102route1_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.line813trip102 DROP CONSTRAINT line813trip102route1_pkey;
       public            postgres    false    215            �           2606    24626 (   line813trip103 line813trip103route1_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.line813trip103
    ADD CONSTRAINT line813trip103route1_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.line813trip103 DROP CONSTRAINT line813trip103route1_pkey;
       public            postgres    false    217            �           2606    24635 (   line813trip104 line813trip104route1_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.line813trip104
    ADD CONSTRAINT line813trip104route1_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.line813trip104 DROP CONSTRAINT line813trip104route1_pkey;
       public            postgres    false    219            �           2606    24644 (   line813trip105 line813trip105route1_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.line813trip105
    ADD CONSTRAINT line813trip105route1_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.line813trip105 DROP CONSTRAINT line813trip105route1_pkey;
       public            postgres    false    221            �           2606    24653 "   line813trip106 line813trip106_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.line813trip106
    ADD CONSTRAINT line813trip106_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.line813trip106 DROP CONSTRAINT line813trip106_pkey;
       public            postgres    false    223            �           2606    24734    lines lines_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.lines
    ADD CONSTRAINT lines_pkey PRIMARY KEY (line_number_id);
 :   ALTER TABLE ONLY public.lines DROP CONSTRAINT lines_pkey;
       public            postgres    false    229            �           2606    24727    trips trips_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.trips
    ADD CONSTRAINT trips_pkey PRIMARY KEY (trip_index_id);
 :   ALTER TABLE ONLY public.trips DROP CONSTRAINT trips_pkey;
       public            postgres    false    228            �           2606    24740    line813 line_number_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.line813
    ADD CONSTRAINT line_number_id_fk FOREIGN KEY (line_number_id) REFERENCES public.lines(line_number_id);
 C   ALTER TABLE ONLY public.line813 DROP CONSTRAINT line_number_id_fk;
       public          postgres    false    229    3239    227            �           2606    24735    line813 trip_index_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.line813
    ADD CONSTRAINT trip_index_id_fk FOREIGN KEY (trip_index_id) REFERENCES public.trips(trip_index_id);
 B   ALTER TABLE ONLY public.line813 DROP CONSTRAINT trip_index_id_fk;
       public          postgres    false    227    3237    228            F   �  x���ݎ�0���S�	���O��ݪj7��j�7�x��W����q�%$\q1�љ�3'8�u[냒���������Y��4@
^�A�w�׺�*]�*�V���JQȽ*��'�:�����i/�N4'�?��U}<�8���B�(��m9��y��*YT2̏ٔ"�T��E[*��U���cP���8�J;q�+����6��e�^4f��� �n���.���UU|�٘@=�[��y{���/�tw�D/{��M�V�_��.�'�M;�p����z�$,�x��L/S����RO��C_v'mZV��R�D�bc�m��KT"���t<部��,8 ���̱���OQ�><����wFW;���Rp���0]���C��O㯾��@Y�@1��߯y�fqX;���*��l��Sԝ�A�����]s��hv�r�+�g8d9l�d���p�p�̝�����1w��&l���x�W��р�SN5���L��`0���F!s�3�����sahPOQ2
S_B�Nr}�C�RPF���@A!A3�hH
$~���� �	D��o��Q�<�"��|G����-/�l�� ~7��J���S�$�)�$�hθ�}Vt����6���O1x�����X2�7P:�ܿp�"w_��s���'u@�ɠ�~z||[,��g��      D   �  x��UM��0=�_�/���v�-�ݪR�-=���o���ʀP���ǐ͆@N�i���{B�w����ӆgRU^@�0�=�b޾�"+���B��ߩ�(Ua!xm!������m�3Q�\��"^��JuR��N��|�]b�x���Ug:����D����*+T',�@3z;ޘ^GC����pi���g��>M^����F���i��s�:^Iא�^�K�A�:�⤀�I>G&R5ڶ��$a�{@�	��H�F���qh+����Z�L��[f^ 9�" �w��\m^h��'��$�,l�o`� ϩ��0l}5��ԫ�kٖ��!vߗH^�ƀ��(�Si��uo�+ۊ��qF�/Ej 	:.�E�f�;� =D��-��z��I⦃�s��?�/?��ȹ=G���I�T3+.�	�8<��lI~c�Z?L��w��4Pc ���Zi�C��Xj����h��+�<k0�at�=j�t52����蒻nd�&�4��P��/&�1�L�|ř��`�tFz|��b�o"B��t�p�:��P\�����T��7���U�]��H�ͭ��h�W������46Kd6܀#snf���ۛ�5,��r	~�7�p���f͇�]bIȣ��?��K#fO�ñ�[�.a��Z��r^�      :   �  x���ݎ�0���S�	*l��.�UBm�ҫ��L�y1ve@(<}��hS�W\��̙h�Agy$���@�l%�0��t�v%�Ίw Y���^<¸Gx�'k��OP@��lߐ�Ke�d���Y�v��f -'j�8(L�]Mq&O�h:��o�α^r�[)J��C�l"y(��
s������e{<Ǝ�g9��.�Me4�L{�Fy!b^��j(E#k�+²��E9JM�ѽ�����"�M�B��h�v(�`驸��uQ�R�}y�O.�;��i<���?�Tf2�%wб��5y-ݰ$ ;O�Ј���u�CDi�	)~�<=F���:�3�LD�'�I����h�����{�����R8b*}�[����mh�M�墧{�#d�/ǡ���'t�#9T�r8L�[��t�/�1�ױ�_<�qt�^Ƀ~��;�n�c���E��d߾m6��}{T�      <   �   x�]��
�0E��W���O��BAJ�݌�J�10&���tQ�j�p�D���� 0����-�J� ��,��������Qr��;M��[��Rf�<t<;��"m�����ά��V�J�&W�+�y#�+��Y����nD���1���sQ��(,��9��{Xk�o�������׉s�X?      >   l  x�u��n�0�sy�<�D(���Ӥj��;�]��4��V}�%�T)�I���65�\+���ʖ �H:��b4^���I�CM��&�&|2��R�J��-uL'���W��h�*U��̿G������J8��ɵ���i��nƪ5��Id_��[̖��)dD\B�*,�K�xv)%�݋�oky���σ�j�FU�����&���9��Q�%��Xpo)��5��n�c�c�ѝZ=����L��
�.5��hYi�SOT�E#f��t�ض�`rMݙ����".���D|E9	p���ݱ�����V7��"�IN�3�s���@��,g7k��-{�phN�ט�T��X�/��p��/����j�2      @   �  x����n�0���S�	V���w��*�ݠ�WUo&�E.Ʈ��_{ %jJ{���`�̙�F	4�S'IRe$+�*��w��]��q�H��u�0���ٮ�4�;i�V�	L�m'�\2�Df��Ͻ�����JD����)O��mN�U�9�[]�Z�\�P{��Z_A�=*Y�J����;�z�L��|����$�>)��� ���K�e�JW�e)�~˼W��U~�z�~��'cm�&*k W֠�E�GSO��(�U�t���bp߀WN��F�~:��`F�V7Сv6�%y�}X
���'�/P�̌nn:
Gi;?��{~x�#�����gtJD�G�(��k�e���\�bGqq�[
O���v�S����Ѭ�]t�c![�x9�m>�c�d_@�a�l;�b�/��c��C�>�ct�^Ƚ��a���f�68�����d_-��6dT`      B   �   x�]��j�0�u|�<A1�w�L� ���n�hF.��#b���P�*��%�%j�`�e�<�րP��*NU�g��^?@ֳ�_)�D�wO���U���Q���--�%?V����q����uI�-Mn�ԝ|"�8�B������sB�۴�m&�2���tG=�1�-��-��v6u����E44��5M�M�:�@�ɋ�^�h�3�UJ��>���q��q�?��[Yq��S�e�z�r�      H   Y   x�̱1D�x�{X� ��.t�u�����8ƀڹ�Q���L�9,�����A�Q6��)G+���i{��P��T�Nj�_�DDj      G   ,   x��I 0�w��BS�8�������������˫w%}��     