# Repository guidance for AI agents

## Purpose and audience

This repository is an incremental Java learning resource. It supplements rather
than replaces the official Java documentation. Write primarily for learners who
need accurate explanations in plain language, with enough context to understand
why the code works.

The root `README.md` is the canonical curriculum and section order. Treat earlier
sections as prerequisites for later sections. Before changing a topic, read its
entry in the root `README.md`, the topic's own documentation, and any prerequisite
sections needed to understand what learners already know.

## Teaching principles

- Introduce one main idea at a time and connect it to concepts already taught.
- Do not rely on an unexplained concept from a later section. If a small preview
  is unavoidable, label it clearly and defer the full explanation to its section.
- Start with a simple, concrete example before discussing edge cases or more
  idiomatic alternatives.
- Explain important terminology when it first appears. Prefer direct language
  and short examples over jargon or abstract definitions alone.
- Explain the reason behind rules and examples; do not merely list syntax.
- Keep statements technically precise. Avoid analogies that create an incorrect
  mental model, or state where an analogy stops being exact.
- Link to relevant official Java documentation for authoritative detail, but
  keep the local explanation useful on its own.

## Content and code conventions

- Use the root `README.md` to decide where new material belongs. Update its
  contents list when adding, removing, renaming, or reordering a section.
- Preserve the progressive structure inside each section: motivation, basic
  syntax or concept, focused examples, common mistakes or caveats, then tasks
  where appropriate.
- Keep Markdown headings descriptive, links relative for repository files, and
  Java snippets small enough to support the surrounding explanation.
- Target JDK 21 as the compatibility baseline. Do not require a newer Java API or
  language feature unless the repository requirements are deliberately updated.
- Prefer runnable, self-contained examples. Match a public class name to its
  filename and add imports explicitly.
- For exercises, keep solutions within the knowledge available at that point in
  the curriculum unless the exercise explicitly practices a later concept.
- Preserve intentional beginner-friendly code when an advanced refactor would
  obscure the lesson. Mention the advanced alternative briefly only when useful.
- When editing prose, fix nearby spelling or grammar problems only when doing so
  does not broaden the requested change substantially or alter the author's tone.

## Accuracy and verification

- Distinguish Java language rules from JVM behavior, library conventions, and
  implementation details.
- Check claims about version-specific behavior against the official Java
  documentation when accuracy may depend on the JDK version.
- Compile every changed standalone Java example when practical. Run it as well
  when its output or runtime behavior is part of the lesson.
- Recheck Markdown links and navigation affected by a change.
- Report what was verified and call out examples that could not be compiled or
  run because they require input, external files, an IDE, or additional setup.

## Scope discipline

Make focused changes that serve the requested lesson. Do not reorganize unrelated
sections, introduce a build system, add dependencies, or apply repository-wide
formatting unless the user asks for it. Preserve unrelated user changes already
present in the working tree.
