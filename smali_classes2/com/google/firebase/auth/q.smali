.class public Lcom/google/firebase/auth/q;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "github.com"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/firebase/auth/a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/firebase/auth/p;

    invoke-direct {v0, p0}, Lcom/google/firebase/auth/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
