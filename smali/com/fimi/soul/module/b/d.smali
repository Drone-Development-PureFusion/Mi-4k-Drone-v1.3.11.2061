.class public final enum Lcom/fimi/soul/module/b/d;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fimi/soul/module/b/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/fimi/soul/module/b/d;

.field private static final synthetic d:[Lcom/fimi/soul/module/b/d;


# instance fields
.field private final b:I

.field private final c:Lcom/fimi/soul/module/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/module/b/d;

    const-string v1, "CLASSIC"

    new-instance v2, Lcom/fimi/soul/module/b/a/a/a;

    invoke-direct {v2}, Lcom/fimi/soul/module/b/a/a/a;-><init>()V

    invoke-direct {v0, v1, v3, v3, v2}, Lcom/fimi/soul/module/b/d;-><init>(Ljava/lang/String;IILcom/fimi/soul/module/b/e;)V

    sput-object v0, Lcom/fimi/soul/module/b/d;->a:Lcom/fimi/soul/module/b/d;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/fimi/soul/module/b/d;

    sget-object v1, Lcom/fimi/soul/module/b/d;->a:Lcom/fimi/soul/module/b/d;

    aput-object v1, v0, v3

    sput-object v0, Lcom/fimi/soul/module/b/d;->d:[Lcom/fimi/soul/module/b/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/fimi/soul/module/b/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/fimi/soul/module/b/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/fimi/soul/module/b/d;->b:I

    iput-object p4, p0, Lcom/fimi/soul/module/b/d;->c:Lcom/fimi/soul/module/b/e;

    return-void
.end method

.method public static a(I)Lcom/fimi/soul/module/b/d;
    .locals 5

    invoke-static {}, Lcom/fimi/soul/module/b/d;->values()[Lcom/fimi/soul/module/b/d;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    iget v4, v0, Lcom/fimi/soul/module/b/d;->b:I

    if-ne v4, p0, :cond_0

    :goto_1
    return-object v0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/module/b/d;->a:Lcom/fimi/soul/module/b/d;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fimi/soul/module/b/d;
    .locals 1

    const-class v0, Lcom/fimi/soul/module/b/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/b/d;

    return-object v0
.end method

.method public static values()[Lcom/fimi/soul/module/b/d;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/b/d;->d:[Lcom/fimi/soul/module/b/d;

    invoke-virtual {v0}, [Lcom/fimi/soul/module/b/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fimi/soul/module/b/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/b/d;->b:I

    return v0
.end method

.method public b()Lcom/fimi/soul/module/b/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/d;->c:Lcom/fimi/soul/module/b/e;

    return-object v0
.end method
