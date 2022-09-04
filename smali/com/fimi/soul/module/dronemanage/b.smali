.class public Lcom/fimi/soul/module/dronemanage/b;
.super Ljava/lang/Object;


# static fields
.field private static F:Lcom/fimi/soul/module/dronemanage/b;


# instance fields
.field private final A:I

.field private final B:I

.field private final C:I

.field private final D:I

.field private E:Landroid/content/Context;

.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->a:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->b:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->c:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->d:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->e:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->f:I

    const/4 v0, 0x6

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->g:I

    const/4 v0, 0x7

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->h:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->i:I

    const/16 v0, 0x9

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->j:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->k:I

    const/16 v0, 0xb

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->l:I

    const/16 v0, 0xc

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->m:I

    const/16 v0, 0xd

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->n:I

    const/16 v0, 0xe

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->o:I

    const/16 v0, 0xf

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->p:I

    const/16 v0, 0x10

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->q:I

    const/16 v0, 0x11

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->r:I

    const/16 v0, 0x12

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->s:I

    const/16 v0, 0x13

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->t:I

    const/16 v0, 0x14

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->u:I

    const/16 v0, 0x15

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->v:I

    const/16 v0, 0x16

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->w:I

    const/16 v0, 0x17

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->x:I

    const/16 v0, 0x18

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->y:I

    const/16 v0, 0x19

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->z:I

    const/16 v0, 0x1a

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->A:I

    const/16 v0, 0x1b

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->B:I

    const/16 v0, 0x1c

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->C:I

    const/16 v0, 0x1d

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/b;->D:I

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/dronemanage/b;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/dronemanage/b;->F:Lcom/fimi/soul/module/dronemanage/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/dronemanage/b;

    invoke-direct {v0}, Lcom/fimi/soul/module/dronemanage/b;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/dronemanage/b;->F:Lcom/fimi/soul/module/dronemanage/b;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/dronemanage/b;->F:Lcom/fimi/soul/module/dronemanage/b;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/b;->E:Landroid/content/Context;

    const/16 v1, 0xbb8

    invoke-static {v0, p1, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    return-void
.end method


# virtual methods
.method public a(ILandroid/content/Context;)V
    .locals 1

    const v0, 0x7f0b0070

    iput-object p2, p0, Lcom/fimi/soul/module/dronemanage/b;->E:Landroid/content/Context;

    packed-switch p1, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    const v0, 0x7f0b0090

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_2
    const v0, 0x7f0b0062

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_3
    const v0, 0x7f0b008f

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_4
    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_5
    const v0, 0x7f0b0081

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_6
    const v0, 0x7f0b0072

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_7
    const v0, 0x7f0b006b

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_8
    const v0, 0x7f0b0063

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_9
    const v0, 0x7f0b0077

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_a
    const v0, 0x7f0b007d

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_b
    const v0, 0x7f0b006d

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_c
    const v0, 0x7f0b007e

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_d
    const v0, 0x7f0b0074

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_e
    const v0, 0x7f0b007c

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_f
    const v0, 0x7f0b0080

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_10
    const v0, 0x7f0b0067

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_11
    const v0, 0x7f0b006c

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_12
    const v0, 0x7f0b006e

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto :goto_0

    :pswitch_13
    const v0, 0x7f0b0061

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_14
    const v0, 0x7f0b0066

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_15
    const v0, 0x7f0b0078

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_16
    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_17
    const v0, 0x7f0b0065

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_18
    const v0, 0x7f0b0060

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_19
    const v0, 0x7f0b0064

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_1a
    const v0, 0x7f0b006a

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_1b
    const v0, 0x7f0b0076

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    :pswitch_1c
    const v0, 0x7f0b0082

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/b;->a(I)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_0
    .end packed-switch
.end method
