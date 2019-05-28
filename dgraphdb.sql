-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2019 a las 21:54:56
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dgraphdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_css`
--

CREATE TABLE `t_css` (
  `ident` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_css`
--

INSERT INTO `t_css` (`ident`, `nombre`, `valor`) VALUES
(1, NULL, 'body {\r\n  margin: 0;\r\n  background: #222;\r\n  min-width: 960px;\r\n}\r\n\r\nrect {\r\n  fill: none;\r\n  pointer-events: all;\r\n}\r\n\r\ncircle {\r\n  fill: none;\r\n  stroke-width: 2.5px;\r\n}'),
(3, NULL, '.link {\r\n  fill: none;\r\n  stroke: #666;\r\n  stroke-width: 1.5px;\r\n}\r\n\r\n#licensing {\r\n  fill: green;\r\n}\r\n\r\n.link.licensing {\r\n  stroke: green;\r\n}\r\n\r\n.link.resolved {\r\n  stroke-dasharray: 0,2 1;\r\n}\r\n\r\ncircle {\r\n  fill: #ccc;\r\n  stroke: #333;\r\n  stroke-width: 1.5px;\r\n}\r\n\r\ntext {\r\n  font: 10px sans-serif;\r\n  pointer-events: none;\r\n  text-shadow: 0 1px 0 #fff, 1px 0 0 #fff, 0 -1px 0 #fff, -1px 0 0 #fff;\r\n}'),
(4, NULL, ''),
(5, NULL, ''),
(6, NULL, ''),
(7, NULL, '    \r\n      #panel {\r\n          background-color: rgba(245,245,245,0.9);\r\n          padding: 5px;\r\n          position: absolute;\r\n          display: block;\r\n      }\r\n'),
(10, NULL, '\r\n      #panel {\r\n          background-color: rgba(245,245,245,0.7);\r\n          padding: 5px;\r\n          position: absolute;\r\n          display: block;\r\n      }');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_dato`
--

CREATE TABLE `t_dato` (
  `ident` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_dato`
--

INSERT INTO `t_dato` (`ident`, `nombre`, `valor`) VALUES
(1, NULL, '[\r\n  {source: \"Microsoft\", target: \"Amazon\", type: \"licensing\"},\r\n  {source: \"Microsoft\", target: \"HTC\", type: \"licensing\"},\r\n  {source: \"Samsung\", target: \"Apple\", type: \"suit\"},\r\n  {source: \"Motorola\", target: \"Apple\", type: \"suit\"},\r\n  {source: \"Nokia\", target: \"Apple\", type: \"resolved\"},\r\n  {source: \"HTC\", target: \"Apple\", type: \"suit\"},\r\n  {source: \"Kodak\", target: \"Apple\", type: \"suit\"},\r\n  {source: \"Microsoft\", target: \"Barnes & Noble\", type: \"suit\"},\r\n  {source: \"Microsoft\", target: \"Foxconn\", type: \"suit\"},\r\n  {source: \"Oracle\", target: \"Google\", type: \"suit\"},\r\n  {source: \"Apple\", target: \"HTC\", type: \"suit\"},\r\n  {source: \"Microsoft\", target: \"Inventec\", type: \"suit\"},\r\n  {source: \"Samsung\", target: \"Kodak\", type: \"resolved\"},\r\n  {source: \"LG\", target: \"Kodak\", type: \"resolved\"},\r\n  {source: \"RIM\", target: \"Kodak\", type: \"suit\"},\r\n  {source: \"Sony\", target: \"LG\", type: \"suit\"},\r\n  {source: \"Kodak\", target: \"LG\", type: \"resolved\"},\r\n  {source: \"Apple\", target: \"Nokia\", type: \"resolved\"},\r\n  {source: \"Qualcomm\", target: \"Nokia\", type: \"resolved\"},\r\n  {source: \"Apple\", target: \"Motorola\", type: \"suit\"},\r\n  {source: \"Microsoft\", target: \"Motorola\", type: \"suit\"},\r\n  {source: \"Motorola\", target: \"Microsoft\", type: \"suit\"},\r\n  {source: \"Huawei\", target: \"ZTE\", type: \"suit\"},\r\n  {source: \"Ericsson\", target: \"ZTE\", type: \"suit\"},\r\n  {source: \"Kodak\", target: \"Samsung\", type: \"resolved\"},\r\n  {source: \"Apple\", target: \"Samsung\", type: \"suit\"},\r\n  {source: \"Kodak\", target: \"RIM\", type: \"suit\"},\r\n  {source: \"Nokia\", target: \"Qualcomm\", type: \"suit\"}\r\n]'),
(2, NULL, '[];'),
(3, NULL, '[];'),
(4, NULL, '[];'),
(5, NULL, '[];'),
(8, NULL, '[];');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_html`
--

CREATE TABLE `t_html` (
  `ident` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_html`
--

INSERT INTO `t_html` (`ident`, `nombre`, `valor`) VALUES
(1, NULL, '<body>'),
(3, NULL, '<body>'),
(4, NULL, '<body>'),
(5, NULL, '<canvas width=\"960\" height=\"500\"></canvas>\r\n'),
(6, NULL, '<canvas width=\"960\" height=\"960\"></canvas>\r\n'),
(7, NULL, '\r\n<head>\r\n    <meta charset=\"utf-8\">\r\n    <title>Wavy Sunset</title>\r\n</head>\r\n<body>\r\n  <div id=\"panel\">\r\n      <div id=\"paper\">\r\n      <label>\r\n        <input id=\'svg\' name=\"type\" type=\"radio\" checked>\r\n        <span>svg</span>\r\n      </label>\r\n      <label>\r\n        <input id=\'canvas\' name=\"type\" type=\"radio\">\r\n        <span>canvas</span>\r\n      </label>\r\n      </div>\r\n  </div>\r\n  <div id=\"example\" style=\"max-width: 960px\"></div>\r\n</body>'),
(10, NULL, '<body>\r\n  <div id=\"panel\">\r\n      <div id=\"paper\">\r\n      <label>\r\n        <input id=\'svg\' name=\"type\" type=\"radio\" checked>\r\n        <span>svg</span>\r\n      </label>\r\n      <label>\r\n        <input id=\'canvas\' name=\"type\" type=\"radio\">\r\n        <span>canvas</span>\r\n      </label>\r\n      </div>\r\n      <div id=\"fps\">FPS: <span>?</span></div>\r\n  </div>\r\n  <div id=\"example\" style=\"max-width: 1090\"></div>');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_lib`
--

CREATE TABLE `t_lib` (
  `ident` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_lib`
--

INSERT INTO `t_lib` (`ident`, `nombre`, `valor`) VALUES
(1, 'd3 v5', '<script src=\"https://d3js.org/d3.v5.js\"></script>'),
(2, 'd3 v3', '<script src=\"//d3js.org/d3.v3.min.js\"></script>'),
(3, 'test', '<script type=\"text/javascript\"></script>'),
(4, 'd3 v4', '<script src=\"https://d3js.org/d3.v4.min.js\"></script>'),
(5, 'D3 Scale Chromatic v1', '<script src=\"https://d3js.org/d3-scale-chromatic.v1.min.js\"></script>'),
(6, 'd3 canvas transition 0.3.7', ' <script src=\"https://unpkg.com/d3-canvas-transition@0.3.7/build/d3-canvas-transition.js\"></script>'),
(7, 'd3 giottojs', ' <script src=\"https://giottojs.org/d3-canvas-transition/0.3.3/d3-canvas-transition.js\"></script>');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_midway`
--

CREATE TABLE `t_midway` (
  `ident` int(11) NOT NULL,
  `ident_proyecto` int(11) NOT NULL,
  `ident_lib` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_midway`
--

INSERT INTO `t_midway` (`ident`, `ident_proyecto`, `ident_lib`) VALUES
(1, 1, 2),
(3, 3, 2),
(8, 3, 3),
(9, 4, 2),
(10, 5, 4),
(11, 6, 4),
(24, 7, 4),
(25, 7, 5),
(26, 7, 6),
(37, 10, 4),
(38, 10, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_proyecto`
--

CREATE TABLE `t_proyecto` (
  `ident` int(11) NOT NULL,
  `ident_html` int(11) NOT NULL,
  `ident_css` int(11) DEFAULT NULL,
  `ident_script` int(11) DEFAULT NULL,
  `ident_dato` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_proyecto`
--

INSERT INTO `t_proyecto` (`ident`, `ident_html`, `ident_css`, `ident_script`, `ident_dato`, `nombre`) VALUES
(1, 1, 1, 1, NULL, 'OMG Particles'),
(3, 3, 3, 3, 1, 'Demandas'),
(4, 4, 4, 4, 2, 'Collision Detection'),
(5, 5, 5, 5, 3, 'Random Walk'),
(6, 6, 6, 6, 4, 'Force-Directed-Tree'),
(7, 7, 7, 7, 5, 'Wavy Sunset'),
(10, 10, 10, 10, 8, 'Lloyd\'s Relaxation');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_script`
--

CREATE TABLE `t_script` (
  `ident` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `valor` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `t_script`
--

INSERT INTO `t_script` (`ident`, `nombre`, `valor`) VALUES
(1, NULL, 'var width = Math.max(960, innerWidth),\r\n    height = Math.max(500, innerHeight);\r\n\r\nvar i = 0;\r\n\r\nvar svg = d3.select(\"body\").append(\"svg\")\r\n    .attr(\"width\", width)\r\n    .attr(\"height\", height);\r\n\r\nsvg.append(\"rect\")\r\n    .attr(\"width\", width)\r\n    .attr(\"height\", height)\r\n    .on(\"ontouchstart\" in document ? \"touchmove\" : \"mousemove\", particle);\r\n\r\nfunction particle() {\r\n  var m = d3.mouse(this);\r\n\r\n  svg.insert(\"circle\", \"rect\")\r\n      .attr(\"cx\", m[0])\r\n      .attr(\"cy\", m[1])\r\n      .attr(\"r\", 1e-6)\r\n      .style(\"stroke\", d3.hsl((i = (i + 1) % 360), 1, .5))\r\n      .style(\"stroke-opacity\", 1)\r\n    .transition()\r\n      .duration(2000)\r\n      .ease(Math.sqrt)\r\n      .attr(\"r\", 100)\r\n      .style(\"stroke-opacity\", 1e-6)\r\n      .remove();\r\n\r\n  d3.event.preventDefault();\r\n}'),
(3, NULL, 'var nodes = {};\r\n\r\n// Compute the distinct nodes from the links.\r\ndatosJson.forEach(function(link) {\r\n  link.source = nodes[link.source] || (nodes[link.source] = {name: link.source});\r\n  link.target = nodes[link.target] || (nodes[link.target] = {name: link.target});\r\n});\r\n\r\nvar width = 960,\r\n    height = 500;\r\n\r\nvar force = d3.layout.force()\r\n    .nodes(d3.values(nodes))\r\n    .links(datosJson)\r\n    .size([width, height])\r\n    .linkDistance(60)\r\n    .charge(-300)\r\n    .on(\"tick\", tick)\r\n    .start();\r\n\r\nvar svg = d3.select(\"body\").append(\"svg\")\r\n    .attr(\"width\", width)\r\n    .attr(\"height\", height);\r\n\r\n// Per-type markers, as they don\'t inherit styles.\r\nsvg.append(\"defs\").selectAll(\"marker\")\r\n    .data([\"suit\", \"licensing\", \"resolved\"])\r\n  .enter().append(\"marker\")\r\n    .attr(\"id\", function(d) { return d; })\r\n    .attr(\"viewBox\", \"0 -5 10 10\")\r\n    .attr(\"refX\", 15)\r\n    .attr(\"refY\", -1.5)\r\n    .attr(\"markerWidth\", 6)\r\n    .attr(\"markerHeight\", 6)\r\n    .attr(\"orient\", \"auto\")\r\n  .append(\"path\")\r\n    .attr(\"d\", \"M0,-5L10,0L0,5\");\r\n\r\nvar path = svg.append(\"g\").selectAll(\"path\")\r\n    .data(force.links())\r\n  .enter().append(\"path\")\r\n    .attr(\"class\", function(d) { return \"link \" + d.type; })\r\n    .attr(\"marker-end\", function(d) { return \"url(#\" + d.type + \")\"; });\r\n\r\nvar circle = svg.append(\"g\").selectAll(\"circle\")\r\n    .data(force.nodes())\r\n  .enter().append(\"circle\")\r\n    .attr(\"r\", 6)\r\n    .call(force.drag);\r\n\r\nvar text = svg.append(\"g\").selectAll(\"text\")\r\n    .data(force.nodes())\r\n  .enter().append(\"text\")\r\n    .attr(\"x\", 8)\r\n    .attr(\"y\", \".31em\")\r\n    .text(function(d) { return d.name; });\r\n\r\n// Use elliptical arc path segments to doubly-encode directionality.\r\nfunction tick() {\r\n  path.attr(\"d\", linkArc);\r\n  circle.attr(\"transform\", transform);\r\n  text.attr(\"transform\", transform);\r\n}\r\n\r\nfunction linkArc(d) {\r\n  var dx = d.target.x - d.source.x,\r\n      dy = d.target.y - d.source.y,\r\n      dr = Math.sqrt(dx * dx + dy * dy);\r\n  return \"M\" + d.source.x + \",\" + d.source.y + \"A\" + dr + \",\" + dr + \" 0 0,1 \" + d.target.x + \",\" + d.target.y;\r\n}\r\n\r\nfunction transform(d) {\r\n  return \"translate(\" + d.x + \",\" + d.y + \")\";\r\n}'),
(4, NULL, 'var width = 960,\r\n    height = 500;\r\n\r\nvar nodes = d3.range(200).map(function() { return {radius: Math.random() * 12 + 4}; }),\r\n    root = nodes[0],\r\n    color = d3.scale.category10();\r\n\r\nroot.radius = 0;\r\nroot.fixed = true;\r\n\r\nvar force = d3.layout.force()\r\n    .gravity(0.05)\r\n    .charge(function(d, i) { return i ? 0 : -2000; })\r\n    .nodes(nodes)\r\n    .size([width, height]);\r\n\r\nforce.start();\r\n\r\nvar svg = d3.select(\"body\").append(\"svg\")\r\n    .attr(\"width\", width)\r\n    .attr(\"height\", height);\r\n\r\nsvg.selectAll(\"circle\")\r\n    .data(nodes.slice(1))\r\n  .enter().append(\"circle\")\r\n    .attr(\"r\", function(d) { return d.radius; })\r\n    .style(\"fill\", function(d, i) { return color(i % 3); });\r\n\r\nforce.on(\"tick\", function(e) {\r\n  var q = d3.geom.quadtree(nodes),\r\n      i = 0,\r\n      n = nodes.length;\r\n\r\n  while (++i < n) q.visit(collide(nodes[i]));\r\n\r\n  svg.selectAll(\"circle\")\r\n      .attr(\"cx\", function(d) { return d.x; })\r\n      .attr(\"cy\", function(d) { return d.y; });\r\n});\r\n\r\nsvg.on(\"mousemove\", function() {\r\n  var p1 = d3.mouse(this);\r\n  root.px = p1[0];\r\n  root.py = p1[1];\r\n  force.resume();\r\n});\r\n\r\nfunction collide(node) {\r\n  var r = node.radius + 16,\r\n      nx1 = node.x - r,\r\n      nx2 = node.x + r,\r\n      ny1 = node.y - r,\r\n      ny2 = node.y + r;\r\n  return function(quad, x1, y1, x2, y2) {\r\n    if (quad.point && (quad.point !== node)) {\r\n      var x = node.x - quad.point.x,\r\n          y = node.y - quad.point.y,\r\n          l = Math.sqrt(x * x + y * y),\r\n          r = node.radius + quad.point.radius;\r\n      if (l < r) {\r\n        l = (l - r) / l * .5;\r\n        node.x -= x *= l;\r\n        node.y -= y *= l;\r\n        quad.point.x += x;\r\n        quad.point.y += y;\r\n      }\r\n    }\r\n    return x1 > nx2 || x2 < nx1 || y1 > ny2 || y2 < ny1;\r\n  };\r\n}'),
(5, NULL, 'var canvas = document.querySelector(\"canvas\"),\r\n    context = canvas.getContext(\"2d\"),\r\n    width = canvas.width,\r\n    height = canvas.height,\r\n    color = d3.scaleSequential(d3.interpolateRainbow).domain([0, 1000]),\r\n    randomX = d3.randomNormal(0.3),\r\n    randomY = d3.randomNormal(0);\r\n\r\nrender();\r\n\r\ncanvas.onclick = render;\r\n\r\nfunction render() {\r\n  var x0 = width / 20,\r\n      y0 = height / 2,\r\n      mainWalk = randomWalk(x0, y0, 1000);\r\n\r\n  context.clearRect(0, 0, width, height);\r\n  context.lineJoin = \"round\";\r\n  context.lineCap = \"round\";\r\n  context.lineWidth = 1.5;\r\n  context.strokeStyle = \"black\";\r\n  renderWalk(mainWalk);\r\n\r\n  context.globalCompositeOperation = \"multiply\";\r\n  context.lineWidth = 1;\r\n  for (var i = 0; i < mainWalk.length; i += 2) {\r\n    var branchStart = mainWalk[i],\r\n        x0 = branchStart[0],\r\n        y0 = branchStart[1];\r\n    for (var j = 0; j < 1; ++j) {\r\n      context.strokeStyle = color(i + (Math.random() - 0.5) * 50);\r\n      var x1 = x0, y1 = y0;\r\n      for (var k = 0, m = 20; k < m; ++k) {\r\n        context.globalAlpha = (m - k - 1) / m;\r\n        var pieceWalk = randomWalk(x1, y1, 10),\r\n            pieceEnd = pieceWalk[pieceWalk.length - 1];\r\n        renderWalk(pieceWalk);\r\n        x1 = pieceEnd[0];\r\n        y1 = pieceEnd[1];\r\n      }\r\n      context.globalAlpha = 1;\r\n    }\r\n  }\r\n}\r\n\r\nfunction renderWalk(walk) {\r\n  var i, n = walk.length;\r\n  context.beginPath();\r\n  context.moveTo(walk[0][0], walk[0][1]);\r\n  for (i = 1; i < n; ++i) {\r\n    context.lineTo(walk[i][0], walk[i][1]);\r\n  }\r\n  context.stroke();\r\n}\r\n\r\nfunction randomWalk(x0, y0, n) {\r\n  var points = new Array(n), i;\r\n  points[0] = [x0, y0];\r\n  for (i = 1; i < n; ++i) {\r\n    points[i] = [\r\n      x0 += randomX() * 2,\r\n      y0 += randomY() * 2\r\n    ];\r\n  }\r\n  return points;\r\n}\r\n'),
(6, NULL, 'var nodes = d3.range(1000).map(function(i) {\r\n  return {\r\n    index: i\r\n  };\r\n});\r\n\r\nvar links = d3.range(nodes.length - 1).map(function(i) {\r\n  return {\r\n    source: Math.floor(Math.sqrt(i)),\r\n    target: i + 1\r\n  };\r\n});\r\n\r\nvar simulation = d3.forceSimulation(nodes)\r\n    .force(\"charge\", d3.forceManyBody())\r\n    .force(\"link\", d3.forceLink(links).distance(20).strength(1))\r\n    .force(\"x\", d3.forceX())\r\n    .force(\"y\", d3.forceY())\r\n    .on(\"tick\", ticked);\r\n\r\nvar canvas = document.querySelector(\"canvas\"),\r\n    context = canvas.getContext(\"2d\"),\r\n    width = canvas.width,\r\n    height = canvas.height;\r\n\r\nd3.select(canvas)\r\n    .call(d3.drag()\r\n        .container(canvas)\r\n        .subject(dragsubject)\r\n        .on(\"start\", dragstarted)\r\n        .on(\"drag\", dragged)\r\n        .on(\"end\", dragended));\r\n\r\nfunction ticked() {\r\n  context.clearRect(0, 0, width, height);\r\n  context.save();\r\n  context.translate(width / 2, height / 2);\r\n\r\n  context.beginPath();\r\n  links.forEach(drawLink);\r\n  context.strokeStyle = \"#aaa\";\r\n  context.stroke();\r\n\r\n  context.beginPath();\r\n  nodes.forEach(drawNode);\r\n  context.fill();\r\n  context.strokeStyle = \"#fff\";\r\n  context.stroke();\r\n\r\n  context.restore();\r\n}\r\n\r\nfunction dragsubject() {\r\n  return simulation.find(d3.event.x - width / 2, d3.event.y - height / 2);\r\n}\r\n\r\nfunction dragstarted() {\r\n  if (!d3.event.active) simulation.alphaTarget(0.3).restart();\r\n  d3.event.subject.fx = d3.event.subject.x;\r\n  d3.event.subject.fy = d3.event.subject.y;\r\n}\r\n\r\nfunction dragged() {\r\n  d3.event.subject.fx = d3.event.x;\r\n  d3.event.subject.fy = d3.event.y;\r\n}\r\n\r\nfunction dragended() {\r\n  if (!d3.event.active) simulation.alphaTarget(0);\r\n  d3.event.subject.fx = null;\r\n  d3.event.subject.fy = null;\r\n}\r\n\r\nfunction drawLink(d) {\r\n  context.moveTo(d.source.x, d.source.y);\r\n  context.lineTo(d.target.x, d.target.y);\r\n}\r\n\r\nfunction drawNode(d) {\r\n  context.moveTo(d.x + 3, d.y);\r\n  context.arc(d.x, d.y, 3, 0, 2 * Math.PI);\r\n}\r\n'),
(7, NULL, '\r\n(function () {\r\n    d3.select(\'#svg\').on(\'click\', function () {\r\n        draw(\'svg\');\r\n    });\r\n    d3.select(\'#canvas\').on(\'click\', function () {\r\n        draw(\'canvas\');\r\n    });\r\n    if (d3.resolution() > 1) {\r\n        d3.select(\'#paper\').append(\'label\').html(\r\n            \"<input id=\'canvas-low\' name=\'type\' type=\'radio\'><span>canvas low resolution</span>\"\r\n        );\r\n        d3.select(\'#canvas-low\').on(\'click\', function () {\r\n            draw(\'canvas\', 1);\r\n        });\r\n    }\r\n\r\n    var color = d3.scaleSequential(d3.interpolateBlues),\r\n        waves, particles, x, y, r, data, boat;\r\n\r\n    draw(\'svg\');\r\n    d3.timer(animate);\r\n\r\n\r\n    function draw(type, r) {\r\n\r\n        var example = d3.select(\"#example\"),\r\n            width = d3.getSize(example.style(\'width\')),\r\n            height = Math.min(500, width);\r\n        x = d3.scaleLinear().range([0, width]);\r\n        y = d3.scaleLinear().range([height, 0]);\r\n\r\n        if (!data)\r\n            data = [0.7, 0.6, 0.4, 0.2].map(function (d, i) {\r\n                var w = wave()\r\n                    .radius(0.02*(i+1)*height)\r\n                    .waveLength(0.2*(i+1))\r\n                    .y(d);\r\n                w.area.x(function (dd) {\r\n                    return x(dd.x) + dd.dx;\r\n                }).y1(function (dd) {\r\n                    return y(dd.y) - dd.dy;\r\n                }).y0(function () {\r\n                    return y(0);\r\n                });\r\n                return w;\r\n            });\r\n\r\n        example.select(\'.paper\').remove();\r\n\r\n        var paper = example\r\n                .append(type)\r\n                .classed(\'paper\', true)\r\n                .attr(\'width\', width).attr(\'height\', height).canvasResolution(r).canvas(true)\r\n                .style(\'stroke-width\', 0.5);\r\n\r\n        sun(paper)\r\n            .append(\'rect\')\r\n            .attr(\'width\', width)\r\n            .attr(\'height\', height)\r\n            .style(\'fill\', \'url(#sun)\');\r\n\r\n        waves = paper\r\n            .append(\'g\')\r\n            .classed(\'waves\', true)\r\n            .selectAll(\'path\')\r\n            .data(data)\r\n            .enter()\r\n            .append(\'path\')\r\n            .style(\'stroke\', \'none\')\r\n            .each(function (d) {\r\n                d3.select(this).attr(\'d\', d.context(null)).style(\'fill\', color(d.y()));\r\n            });\r\n\r\n        var circles = paper.selectAll(\'g.circles\')\r\n            .data(data)\r\n            .enter()\r\n            .append(\'g\')\r\n            .classed(\'circles\', true)\r\n            .selectAll(\'circles\')\r\n            .data(function (d) {return d.points();})\r\n            .enter()\r\n            .append(\'circle\')\r\n            .attr(\'r\', function (d) {return d.radius;})\r\n            .style(\'fill\', \'none\')\r\n            .style(\'stroke\', \'#666\')\r\n            .attr(\'cx\', function (d) {return x(d.x);})\r\n            .attr(\'cy\', function (d) {return y(d.y);});\r\n\r\n        particles = paper.selectAll(\'g.particles\')\r\n            .data(data)\r\n            .enter()\r\n            .append(\'g\')\r\n            .classed(\'particles\', true)\r\n            .selectAll(\'circles\')\r\n            .data(function (d) {return d.points();})\r\n            .enter()\r\n            .append(\'circle\')\r\n            .attr(\'r\', 3)\r\n            .style(\'fill\', \'#666\')\r\n            .style(\'stroke-width\', 0)\r\n            .attr(\'cx\', function (d) {return x(d.x) + d.dx;})\r\n            .attr(\'cy\', function (d) {return y(d.y) - d.dy;});\r\n\r\n        boat = paper.append(\'text\')\r\n            .text(\"?\")\r\n            .style(\'text-anchor\', \'middle\')\r\n            .style(\'alignment-baseline\', \'middle\')\r\n            .style(\"font-size\", \"60px\");\r\n\r\n        moveBoat();\r\n    }\r\n\r\n    function animate () {\r\n        waves.each(function (d) {\r\n            d3.select(this).attr(\'d\', d.tick());\r\n        });\r\n        particles.data(function (d) {return d.points();})\r\n            .attr(\'cx\', function (d) {return x(d.x) + d.dx;})\r\n            .attr(\'cy\', function (d) {return y(d.y) - d.dy;});\r\n        moveBoat();\r\n    }\r\n\r\n    function moveBoat() {\r\n        var d = data[1].point(20);\r\n        boat.attr(\"transform\", \"translate(\" + (x(d.x) + d.dx) + \", \" + (y(d.y) - d.dy) + \")\");\r\n    }\r\n\r\n    function sun (paper) {\r\n        paper\r\n            .append(\'defs\')\r\n            .append(\'radialGradient\')\r\n            .attr(\'id\', \'sun\')\r\n            .attr(\'cx\', \'70%\')\r\n            .attr(\'cy\', \'30%\')\r\n            .attr(\'fx\', \'60%\')\r\n            .attr(\'fy\', \'30%\')\r\n            .selectAll(\'stop\')\r\n            .data([\r\n                {color: \"#e31a1c\", offset: \'0%\'},\r\n                {color: \'#fd8d3c\', offset: \'60%\'}\r\n            ])\r\n            .enter()\r\n            .append(\'stop\')\r\n            .attr(\'offset\', function (d) {\r\n                return d.offset;\r\n            })\r\n            .attr(\'stop-color\', function (d) {\r\n                return d.color;\r\n            });\r\n        return paper;\r\n    }\r\n\r\n    function wave() {\r\n        var radius = 0.1,       // intensity of wave\r\n            waveLength = 1,     // wave length\r\n            y = 0,\r\n            area = d3.area().curve(d3.curveNatural),\r\n            extent = [0, 1],\r\n            pi = Math.PI,\r\n            cos = Math.cos,\r\n            sin = Math.sin,\r\n            N = 8,\r\n            speed = 0.01,\r\n            time = 0;\r\n\r\n        function wave (d) {\r\n            return area(wave.points(d));\r\n        }\r\n\r\n        wave.area = area;\r\n\r\n        wave.tick = function () {\r\n            time += 1;\r\n            return wave;\r\n        };\r\n\r\n        wave.context = function (_) {\r\n            if (!arguments.length) return area.context();\r\n            area.context(_);\r\n            return wave;\r\n        };\r\n\r\n        wave.extent = function (_) {\r\n            if (!arguments.length) return extent;\r\n            extent = _;\r\n            return wave;\r\n        };\r\n\r\n        wave.N = function (_) {\r\n            if (!arguments.length) return N;\r\n            N = +_;\r\n            return wave;\r\n        };\r\n\r\n        wave.waveLength = function (_) {\r\n            if (!arguments.length) return waveLength;\r\n            waveLength = _;\r\n            return wave;\r\n        };\r\n\r\n        wave.y = function (_) {\r\n            if (!arguments.length) return y;\r\n            y = _;\r\n            return wave;\r\n        };\r\n\r\n        wave.radius = function (_) {\r\n            if (!arguments.length) return radius;\r\n            radius = _;\r\n            return wave;\r\n        };\r\n\r\n        wave.speed = function (_) {\r\n            if (!arguments.length) return speed;\r\n            speed = _;\r\n            return wave;\r\n        };\r\n\r\n        wave.points = function () {\r\n            var w = extent[1] - extent[0] + 2*waveLength,\r\n                dx = waveLength/N,\r\n                Nx = Math.round(w/dx) + 1;\r\n\r\n            return d3.range(Nx).map(point);\r\n        };\r\n\r\n        wave.point = point;\r\n\r\n        function point (i) {\r\n            var da = 2*pi/N,\r\n                dx = waveLength/N,\r\n                x0 = extent[0] - waveLength,\r\n                a = i*da - time*speed*pi;\r\n\r\n            return {\r\n                x: x0 + i * dx,\r\n                y: y,\r\n                angle: a,\r\n                radius: radius,\r\n                dx: radius * cos(a),\r\n                dy: radius * sin(a)\r\n            };\r\n        }\r\n\r\n        return wave;\r\n    }\r\n\r\n}());'),
(10, NULL, '(function () {\r\n    d3.select(\'#svg\').on(\'click\', function () {\r\n        draw(\'svg\');\r\n    });\r\n    d3.select(\'#canvas\').on(\'click\', function () {\r\n        draw(\'canvas\');\r\n    });\r\n    if (d3.resolution() > 1) {\r\n        d3.select(\'#paper\').append(\'label\').html(\r\n            \"<input id=\'canvas-low\' name=\'type\' type=\'radio\'><span>canvas low resolution</span>\"\r\n        );\r\n        d3.select(\'#canvas-low\').on(\'click\', function () {\r\n            draw(\'canvas\', 1);\r\n        });\r\n    }\r\n    var N = 1000;\r\n    var paper, vertices, iterations, DD;\r\n    var example = d3.select(\"#example\"),\r\n        fps = d3.select(\"#fps span\"),\r\n        width = d3.getSize(example.style(\'width\')),\r\n        height = Math.min(500, width),\r\n        voronoi = d3.voronoi().extent([[0, 0], [width, height]]),\r\n        fill = d3.scaleSequential(d3.interpolateCool).domain([0, Math.sqrt(width * height / N) * 4]);\r\n\r\n    reset(width/2, height/2);\r\n    draw(\'svg\');\r\n\r\n    var time0 = d3.now(), frames = 0;\r\n    d3.timer(redraw);\r\n\r\n    function draw(type, r) {\r\n        example.select(\'.paper\').remove();\r\n        paper = example\r\n                .append(type)\r\n                .classed(\'paper\', true)\r\n                .on(\"click\", function() {\r\n                    var mouse = d3.mouse(this);\r\n                    reset(mouse[0], mouse[1]);\r\n                })\r\n                .attr(\'width\', width).attr(\'height\', height).canvasResolution(r).canvas(true)\r\n                .attr(\"stroke-width\", \'0.5px\')\r\n                .attr(\"stroke\", \'#fff\');\r\n    }\r\n\r\n    function redraw() {\r\n        var paths = paper.selectAll(\"path\").data(voronoi.polygons(vertices));\r\n        frames++;\r\n\r\n        paths.enter()\r\n                .append(\"path\")\r\n                .merge(paths)\r\n                .attr(\'d\', marks())\r\n                .style(\'fill\', function (d) {return fill(Math.sqrt(d3.polygonArea(d)))});\r\n\r\n        var time1 = d3.now();\r\n        if (time1 - time0 > 1000) {\r\n            fps.text(Math.round(1000*frames/(time1 - time0)));\r\n            time0 = time1;\r\n            frames = 0;\r\n        }\r\n    }\r\n\r\n    function marks () {\r\n        var context;\r\n\r\n        function cell (d, i) {\r\n            var buffer,\r\n                centroid = d3.polygonCentroid(d),\r\n                vertex = vertices[i],\r\n                dx = centroid[0] - vertex[0],\r\n                dy = centroid[1] - vertex[1];\r\n            if (!context) context = buffer = d3.path();\r\n            vertex[0] += dx;\r\n            vertex[1] += dy;\r\n            context.moveTo(d[0][0], d[0][1]);\r\n            for (var j=1;j<d.length;++j) context.lineTo(d[j][0], d[j][1]);\r\n            context.closePath();\r\n            if (buffer) return context = null, buffer + \"\" || null;\r\n        }\r\n\r\n        cell.context = function (_) {\r\n            if (arguments.length === 0) return context;\r\n            context = _;\r\n            return cell;\r\n        };\r\n\r\n        return cell;\r\n    }\r\n\r\n    function reset (x, y) {\r\n        vertices = d3.range(N).map(function () {\r\n            return [x + Math.random() - .5, y + Math.random() - .5];\r\n        });\r\n        iterations = 0;\r\n    }\r\n}());');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `t_css`
--
ALTER TABLE `t_css`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_dato`
--
ALTER TABLE `t_dato`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_html`
--
ALTER TABLE `t_html`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_lib`
--
ALTER TABLE `t_lib`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_midway`
--
ALTER TABLE `t_midway`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_proyecto`
--
ALTER TABLE `t_proyecto`
  ADD PRIMARY KEY (`ident`);

--
-- Indices de la tabla `t_script`
--
ALTER TABLE `t_script`
  ADD PRIMARY KEY (`ident`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `t_css`
--
ALTER TABLE `t_css`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `t_dato`
--
ALTER TABLE `t_dato`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `t_html`
--
ALTER TABLE `t_html`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `t_lib`
--
ALTER TABLE `t_lib`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `t_midway`
--
ALTER TABLE `t_midway`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `t_proyecto`
--
ALTER TABLE `t_proyecto`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `t_script`
--
ALTER TABLE `t_script`
  MODIFY `ident` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
