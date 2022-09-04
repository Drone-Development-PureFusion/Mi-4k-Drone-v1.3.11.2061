.class public Lcom/google/firebase/b/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/b/f$a;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method private constructor <init>(Lcom/google/firebase/b/f$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/firebase/b/f$a;->a(Lcom/google/firebase/b/f$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/b/f;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/firebase/b/f$a;Lcom/google/firebase/b/f$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/b/f;-><init>(Lcom/google/firebase/b/f$a;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/b/f;->a:Z

    return v0
.end method
