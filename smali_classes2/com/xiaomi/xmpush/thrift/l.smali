.class public Lcom/xiaomi/xmpush/thrift/l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Lorg/a/b/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xiaomi/xmpush/thrift/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Cloneable;",
        "Lorg/a/b/a",
        "<",
        "Lcom/xiaomi/xmpush/thrift/l;",
        "Lcom/xiaomi/xmpush/thrift/l$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/xiaomi/xmpush/thrift/l$a;",
            "Lorg/a/b/a/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lorg/a/b/b/j;

.field private static final e:Lorg/a/b/b/b;

.field private static final f:Lorg/a/b/b/b;


# instance fields
.field public a:D

.field public b:D

.field private g:Ljava/util/BitSet;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x4

    new-instance v0, Lorg/a/b/b/j;

    const-string v1, "Location"

    invoke-direct {v0, v1}, Lorg/a/b/b/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/xiaomi/xmpush/thrift/l;->d:Lorg/a/b/b/j;

    new-instance v0, Lorg/a/b/b/b;

    const-string v1, "longitude"

    invoke-direct {v0, v1, v5, v6}, Lorg/a/b/b/b;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/xiaomi/xmpush/thrift/l;->e:Lorg/a/b/b/b;

    new-instance v0, Lorg/a/b/b/b;

    const-string v1, "latitude"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v5, v2}, Lorg/a/b/b/b;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lcom/xiaomi/xmpush/thrift/l;->f:Lorg/a/b/b/b;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/xiaomi/xmpush/thrift/l$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lcom/xiaomi/xmpush/thrift/l$a;->a:Lcom/xiaomi/xmpush/thrift/l$a;

    new-instance v2, Lorg/a/b/a/b;

    const-string v3, "longitude"

    new-instance v4, Lorg/a/b/a/c;

    invoke-direct {v4, v5}, Lorg/a/b/a/c;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lorg/a/b/a/b;-><init>(Ljava/lang/String;BLorg/a/b/a/c;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/xiaomi/xmpush/thrift/l$a;->b:Lcom/xiaomi/xmpush/thrift/l$a;

    new-instance v2, Lorg/a/b/a/b;

    const-string v3, "latitude"

    new-instance v4, Lorg/a/b/a/c;

    invoke-direct {v4, v5}, Lorg/a/b/a/c;-><init>(B)V

    invoke-direct {v2, v3, v6, v4}, Lorg/a/b/a/b;-><init>(Ljava/lang/String;BLorg/a/b/a/c;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/xiaomi/xmpush/thrift/l;->c:Ljava/util/Map;

    const-class v0, Lcom/xiaomi/xmpush/thrift/l;

    sget-object v1, Lcom/xiaomi/xmpush/thrift/l;->c:Ljava/util/Map;

    invoke-static {v0, v1}, Lorg/a/b/a/b;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lcom/xiaomi/xmpush/thrift/l;->g:Ljava/util/BitSet;

    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    return-wide v0
.end method

.method public a(D)Lcom/xiaomi/xmpush/thrift/l;
    .locals 1

    iput-wide p1, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xiaomi/xmpush/thrift/l;->a(Z)V

    return-object p0
.end method

.method public a(Lorg/a/b/b/e;)V
    .locals 4

    const/4 v3, 0x4

    const/4 v2, 0x1

    invoke-virtual {p1}, Lorg/a/b/b/e;->g()Lorg/a/b/b/j;

    :goto_0
    invoke-virtual {p1}, Lorg/a/b/b/e;->i()Lorg/a/b/b/b;

    move-result-object v0

    iget-byte v1, v0, Lorg/a/b/b/b;->b:B

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lorg/a/b/b/e;->h()V

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->b()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lorg/a/b/b/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'longitude\' was not found in serialized data! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/a/b/b/f;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-short v1, v0, Lorg/a/b/b/b;->c:S

    packed-switch v1, :pswitch_data_0

    iget-byte v0, v0, Lorg/a/b/b/b;->b:B

    invoke-static {p1, v0}, Lorg/a/b/b/h;->a(Lorg/a/b/b/e;B)V

    :goto_1
    invoke-virtual {p1}, Lorg/a/b/b/e;->j()V

    goto :goto_0

    :pswitch_0
    iget-byte v1, v0, Lorg/a/b/b/b;->b:B

    if-ne v1, v3, :cond_1

    invoke-virtual {p1}, Lorg/a/b/b/e;->v()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    invoke-virtual {p0, v2}, Lcom/xiaomi/xmpush/thrift/l;->a(Z)V

    goto :goto_1

    :cond_1
    iget-byte v0, v0, Lorg/a/b/b/b;->b:B

    invoke-static {p1, v0}, Lorg/a/b/b/h;->a(Lorg/a/b/b/e;B)V

    goto :goto_1

    :pswitch_1
    iget-byte v1, v0, Lorg/a/b/b/b;->b:B

    if-ne v1, v3, :cond_2

    invoke-virtual {p1}, Lorg/a/b/b/e;->v()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    invoke-virtual {p0, v2}, Lcom/xiaomi/xmpush/thrift/l;->b(Z)V

    goto :goto_1

    :cond_2
    iget-byte v0, v0, Lorg/a/b/b/b;->b:B

    invoke-static {p1, v0}, Lorg/a/b/b/h;->a(Lorg/a/b/b/e;B)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->d()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lorg/a/b/b/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Required field \'latitude\' was not found in serialized data! Struct: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/a/b/b/f;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->e()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/xmpush/thrift/l;->g:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-void
.end method

.method public a(Lcom/xiaomi/xmpush/thrift/l;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-wide v2, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    iget-wide v4, p1, Lcom/xiaomi/xmpush/thrift/l;->a:D

    cmpl-double v1, v2, v4

    if-nez v1, :cond_0

    iget-wide v2, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    iget-wide v4, p1, Lcom/xiaomi/xmpush/thrift/l;->b:D

    cmpl-double v1, v2, v4

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Lcom/xiaomi/xmpush/thrift/l;)I
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, Lcom/xiaomi/xmpush/thrift/l;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    iget-wide v2, p1, Lcom/xiaomi/xmpush/thrift/l;->a:D

    invoke-static {v0, v1, v2, v3}, Lorg/a/b/b;->a(DD)I

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->d()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, Lcom/xiaomi/xmpush/thrift/l;->d()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    iget-wide v2, p1, Lcom/xiaomi/xmpush/thrift/l;->b:D

    invoke-static {v0, v1, v2, v3}, Lorg/a/b/b;->a(DD)I

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(D)Lcom/xiaomi/xmpush/thrift/l;
    .locals 1

    iput-wide p1, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xiaomi/xmpush/thrift/l;->b(Z)V

    return-object p0
.end method

.method public b(Lorg/a/b/b/e;)V
    .locals 2

    invoke-virtual {p0}, Lcom/xiaomi/xmpush/thrift/l;->e()V

    sget-object v0, Lcom/xiaomi/xmpush/thrift/l;->d:Lorg/a/b/b/j;

    invoke-virtual {p1, v0}, Lorg/a/b/b/e;->a(Lorg/a/b/b/j;)V

    sget-object v0, Lcom/xiaomi/xmpush/thrift/l;->e:Lorg/a/b/b/b;

    invoke-virtual {p1, v0}, Lorg/a/b/b/e;->a(Lorg/a/b/b/b;)V

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    invoke-virtual {p1, v0, v1}, Lorg/a/b/b/e;->a(D)V

    invoke-virtual {p1}, Lorg/a/b/b/e;->b()V

    sget-object v0, Lcom/xiaomi/xmpush/thrift/l;->f:Lorg/a/b/b/b;

    invoke-virtual {p1, v0}, Lorg/a/b/b/e;->a(Lorg/a/b/b/b;)V

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    invoke-virtual {p1, v0, v1}, Lorg/a/b/b/e;->a(D)V

    invoke-virtual {p1}, Lorg/a/b/b/e;->b()V

    invoke-virtual {p1}, Lorg/a/b/b/e;->c()V

    invoke-virtual {p1}, Lorg/a/b/b/e;->a()V

    return-void
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/xmpush/thrift/l;->g:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-void
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/xmpush/thrift/l;->g:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    return v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    return-wide v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/xiaomi/xmpush/thrift/l;

    invoke-virtual {p0, p1}, Lcom/xiaomi/xmpush/thrift/l;->b(Lcom/xiaomi/xmpush/thrift/l;)I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/xmpush/thrift/l;->g:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    return v0
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcom/xiaomi/xmpush/thrift/l;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/xiaomi/xmpush/thrift/l;

    invoke-virtual {p0, p1}, Lcom/xiaomi/xmpush/thrift/l;->a(Lcom/xiaomi/xmpush/thrift/l;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Location("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "longitude:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/xiaomi/xmpush/thrift/l;->a:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "latitude:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/xiaomi/xmpush/thrift/l;->b:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
