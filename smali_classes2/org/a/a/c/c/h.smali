.class public Lorg/a/a/c/c/h;
.super Lorg/a/a/c/c/m;


# annotations
.annotation build Lorg/a/a/a/c;
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "HEAD"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/a/a/c/c/m;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lorg/a/a/c/c/m;-><init>()V

    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/a/a/c/c/h;->a(Ljava/net/URI;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;)V
    .locals 0

    invoke-direct {p0}, Lorg/a/a/c/c/m;-><init>()V

    invoke-virtual {p0, p1}, Lorg/a/a/c/c/h;->a(Ljava/net/URI;)V

    return-void
.end method


# virtual methods
.method public getMethod()Ljava/lang/String;
    .locals 1

    const-string v0, "HEAD"

    return-object v0
.end method
