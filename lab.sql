--
-- PostgreSQL database dump
--

-- Dumped from database version 16.0
-- Dumped by pg_dump version 16.0

-- Started on 2023-11-24 18:38:46

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 219 (class 1259 OID 16749)
-- Name: estoque; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estoque (
    nrolote integer NOT NULL,
    codproducao integer NOT NULL
);


ALTER TABLE public.estoque OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16703)
-- Name: laboratorio; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.laboratorio (
    idlab integer NOT NULL,
    nomelab character varying(40) NOT NULL,
    endereco character varying(80),
    cidade character varying(80),
    contato character varying(20)
);


ALTER TABLE public.laboratorio OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16744)
-- Name: lote; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.lote (
    nrolote integer NOT NULL,
    gtin numeric(14,0) NOT NULL,
    datavalidade date NOT NULL
);


ALTER TABLE public.lote OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16730)
-- Name: medicamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.medicamento (
    codmedic integer NOT NULL,
    nomemedic character varying(40) NOT NULL,
    nroanvisa numeric(11,0) NOT NULL,
    patente character varying(20),
    idlabpesquisa integer,
    datapesquisa date,
    idlabensaios integer,
    dataensaios date
);


ALTER TABLE public.medicamento OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16735)
-- Name: producao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producao (
    codproducao integer NOT NULL,
    idlab integer NOT NULL,
    codmedic integer NOT NULL,
    qtdproduto integer NOT NULL,
    dataproducao date NOT NULL
);


ALTER TABLE public.producao OWNER TO postgres;

--
-- TOC entry 4864 (class 0 OID 16749)
-- Dependencies: 219
-- Data for Name: estoque; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.estoque (nrolote, codproducao) VALUES (10, 6);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (9, 10);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (8, 4);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (6, 8);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (5, 3);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (4, 5);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (3, 9);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (2, 2);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (7, 7);
INSERT INTO public.estoque (nrolote, codproducao) VALUES (1, 1);


--
-- TOC entry 4860 (class 0 OID 16703)
-- Dependencies: 215
-- Data for Name: laboratorio; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.laboratorio (idlab, nomelab, endereco, cidade, contato) VALUES (2, 'MediCorp Labs', 'R. Floriano Peixoto, 456', 'Sao Jose do Rio Preto', '(17) 9876-5432');
INSERT INTO public.laboratorio (idlab, nomelab, endereco, cidade, contato) VALUES (3, 'GenoLab', 'R. Visc. de Mauá, 101 - América', 'Joinville ', '(47) 1234-5678');
INSERT INTO public.laboratorio (idlab, nomelab, endereco, cidade, contato) VALUES (4, 'Cress', 'R. Pres. Prudente de Moraes, 209 - Santo Antônio', 'Joinville', '(47) 3435-3166');
INSERT INTO public.laboratorio (idlab, nomelab, endereco, cidade, contato) VALUES (1, 'Morck ', 'Av. das Nacoes Unidas, 12995 - Pinheiros', 'Sao Paulo', '(11) 3346-8507');
INSERT INTO public.laboratorio (idlab, nomelab, endereco, cidade, contato) VALUES (5, 'Aura Farma', 'R. Des. Costa Carvalho, 312 - Batel', 'Curitiba', '(41) 98765-4321');


--
-- TOC entry 4863 (class 0 OID 16744)
-- Dependencies: 218
-- Data for Name: lote; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (1, 9876543210987, '2022-10-12');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (10, 4321098765432, '2023-06-10');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (9, 1098765432109, '2025-10-05');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (8, 5678901234567, '2024-04-11');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (7, 8901234567890, '2024-07-01');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (6, 3210987654321, '2024-07-20');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (5, 2345678901234, '2024-04-05');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (4, 8765432109876, '2024-04-22');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (3, 4567890123456, '2025-09-17');
INSERT INTO public.lote (nrolote, gtin, datavalidade) VALUES (2, 1234567890123, '2022-11-09');


--
-- TOC entry 4861 (class 0 OID 16730)
-- Dependencies: 216
-- Data for Name: medicamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (1, 'Difenidramina', 98065400051, 'A61P37', 1, '2010-01-15', 2, '2010-02-28');
INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (3, 'Ciclizina', 98079200001, 'A61P37', 2, '2003-02-07', 2, '2003-02-26');
INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (4, 'Fenindamina', 98054300021, 'A61P37', 4, '2008-11-14', 1, '2009-01-10');
INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (5, 'Fexofenadina', 98032100099, 'A61P37', 4, '2005-04-19', 4, '2005-06-19');
INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (6, 'Twinrix', 81070520001, 'A61K39', 3, '2012-07-13', 3, '2012-11-09');
INSERT INTO public.medicamento (codmedic, nomemedic, nroanvisa, patente, idlabpesquisa, datapesquisa, idlabensaios, dataensaios) VALUES (2, 'Mevatilina', 42023300023, 'A61K45', 5, '2006-05-23', 4, '2006-08-23');


--
-- TOC entry 4862 (class 0 OID 16735)
-- Dependencies: 217
-- Data for Name: producao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (10, 3, 6, 750, '2023-10-05');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (9, 4, 4, 1000, '2023-09-17');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (8, 1, 1, 800, '2023-07-20');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (7, 3, 6, 600, '2022-07-01');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (6, 5, 2, 200, '2022-06-10');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (5, 2, 3, 400, '2022-04-22');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (4, 2, 3, 400, '2022-04-11');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (3, 4, 5, 1000, '2022-04-05');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (2, 5, 2, 125, '2021-11-09');
INSERT INTO public.producao (codproducao, idlab, codmedic, qtdproduto, dataproducao) VALUES (1, 1, 1, 800, '2021-05-06');


--
-- TOC entry 4716 (class 2606 OID 24978)
-- Name: estoque estoque_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT estoque_pkey PRIMARY KEY (nrolote);


--
-- TOC entry 4704 (class 2606 OID 24986)
-- Name: laboratorio laboratorio_contato_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.laboratorio
    ADD CONSTRAINT laboratorio_contato_key UNIQUE (contato);


--
-- TOC entry 4706 (class 2606 OID 16707)
-- Name: laboratorio laboratorios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.laboratorio
    ADD CONSTRAINT laboratorios_pkey PRIMARY KEY (idlab);


--
-- TOC entry 4712 (class 2606 OID 24984)
-- Name: lote lote_gtin_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lote
    ADD CONSTRAINT lote_gtin_key UNIQUE (gtin);


--
-- TOC entry 4714 (class 2606 OID 24972)
-- Name: lote lotes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lote
    ADD CONSTRAINT lotes_pkey PRIMARY KEY (nrolote);


--
-- TOC entry 4708 (class 2606 OID 16734)
-- Name: medicamento medicamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medicamento
    ADD CONSTRAINT medicamento_pkey PRIMARY KEY (codmedic);


--
-- TOC entry 4710 (class 2606 OID 24966)
-- Name: producao producao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producao
    ADD CONSTRAINT producao_pkey PRIMARY KEY (codproducao);


-- Completed on 2023-11-24 18:38:47

--
-- PostgreSQL database dump complete
--

