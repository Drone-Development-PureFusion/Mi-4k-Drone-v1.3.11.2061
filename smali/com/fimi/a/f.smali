.class public Lcom/fimi/a/f;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/a/f;


# instance fields
.field private b:Lcom/fimi/a/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/a/f;

    invoke-direct {v0}, Lcom/fimi/a/f;-><init>()V

    sput-object v0, Lcom/fimi/a/f;->a:Lcom/fimi/a/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/fimi/a/b/b;->a:Lcom/fimi/a/b/b;

    iput-object v0, p0, Lcom/fimi/a/f;->b:Lcom/fimi/a/b/b;

    return-void
.end method

.method public static a()Lcom/fimi/a/f;
    .locals 1

    sget-object v0, Lcom/fimi/a/f;->a:Lcom/fimi/a/f;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/a/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/a/f;->b:Lcom/fimi/a/b/b;

    return-void
.end method

.method public b()Lcom/fimi/a/b/b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/a/f;->b:Lcom/fimi/a/b/b;

    return-object v0
.end method
