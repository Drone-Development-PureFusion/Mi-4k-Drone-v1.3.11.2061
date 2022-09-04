.class public Lcom/fimi/soul/biz/h/c;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)V
    .locals 5

    const v1, 0x7f0b008f

    const v3, 0x7f0b0076

    const v2, 0x7f0b0067

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v4

    packed-switch p0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    const v0, 0x7f0b0090

    :goto_1
    if-eqz v0, :cond_0

    if-ne v0, v3, :cond_2

    invoke-static {v4}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v1

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    :cond_1
    :goto_2
    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbb8

    invoke-static {v4, v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_2
    const v0, 0x7f0b0062

    goto :goto_1

    :pswitch_3
    move v0, v1

    goto :goto_1

    :pswitch_4
    const v0, 0x7f0b0071

    goto :goto_1

    :pswitch_5
    const v0, 0x7f0b0072

    goto :goto_1

    :pswitch_6
    const v0, 0x7f0b006b

    goto :goto_1

    :pswitch_7
    const v0, 0x7f0b0063

    goto :goto_1

    :pswitch_8
    const v0, 0x7f0b0077

    goto :goto_1

    :pswitch_9
    const v0, 0x7f0b007d

    goto :goto_1

    :pswitch_a
    const v0, 0x7f0b006d

    goto :goto_1

    :pswitch_b
    const v0, 0x7f0b007e

    goto :goto_1

    :pswitch_c
    const v0, 0x7f0b0074

    goto :goto_1

    :pswitch_d
    const v0, 0x7f0b007c

    goto :goto_1

    :pswitch_e
    const v0, 0x7f0b0080

    goto :goto_1

    :pswitch_f
    move v0, v2

    goto :goto_1

    :pswitch_10
    const v0, 0x7f0b006c

    goto :goto_1

    :pswitch_11
    const v0, 0x7f0b006e

    goto :goto_1

    :pswitch_12
    const v0, 0x7f0b0061

    goto :goto_1

    :pswitch_13
    const v0, 0x7f0b0066

    goto :goto_1

    :pswitch_14
    const v0, 0x7f0b0078

    goto :goto_1

    :pswitch_15
    const v0, 0x7f0b0070

    goto :goto_1

    :pswitch_16
    const v0, 0x7f0b0065

    goto :goto_1

    :pswitch_17
    const v0, 0x7f0b0060

    goto :goto_1

    :pswitch_18
    const v0, 0x7f0b0064

    goto :goto_1

    :pswitch_19
    const v0, 0x7f0b006a

    goto :goto_1

    :pswitch_1a
    move v0, v3

    goto :goto_1

    :pswitch_1b
    const v0, 0x7f0b0073

    goto :goto_1

    :pswitch_1c
    const v0, 0x7f0b0068

    goto :goto_1

    :pswitch_1d
    const v0, 0x7f0b0075

    goto/16 :goto_1

    :pswitch_1e
    const v0, 0x7f0b007b

    goto/16 :goto_1

    :pswitch_1f
    const v0, 0x7f0b007a

    goto/16 :goto_1

    :pswitch_20
    const v0, 0x7f0b0079

    goto/16 :goto_1

    :pswitch_21
    const v0, 0x7f0b006f

    goto/16 :goto_1

    :pswitch_22
    const v0, 0x7f0b007f

    goto/16 :goto_1

    :pswitch_23
    const v0, 0x7f0b0069

    goto/16 :goto_1

    :cond_2
    if-ne v0, v2, :cond_3

    invoke-static {v4}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v1

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    if-ne v0, v1, :cond_1

    invoke-static {v4}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v1

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    invoke-static {v1, v2, v3}, Lcom/fimi/soul/utils/av;->a(Landroid/app/Activity;J)V

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
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
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_23
    .end packed-switch
.end method
