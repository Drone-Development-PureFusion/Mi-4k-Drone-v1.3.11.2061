.class public Lcom/google/firebase/auth/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "facebook.com"


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

    new-instance v0, Lcom/google/firebase/auth/e;

    invoke-direct {v0, p0}, Lcom/google/firebase/auth/e;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
